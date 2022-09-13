package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.*;

/*
�����ҷ����
 */
public class Server {
    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

    /*
     java.net.ServerSocket
     ServerSocket�������ڷ�����ϵġ�����Ҫ����������
     1:�������������˿�(�ͻ���Socket����ͨ������˿������˽������ӵ�)
     2:��������˿ڣ�һ���ͻ������ӻ���������һ��Socket��ͨ����Socket��ͻ��˽���
     ������ǽ�Socket����Ϊ"�绰"����ôServerSocket�൱��"�ܻ�"
     */
    private ServerSocket serverSocket;
    //private PrintWriter[] allOut = {};
    private Collection<PrintWriter> allOut = new ArrayList<PrintWriter>();

    public Server() {
        try {
            /*
                ServerSocket�ڴ�����ʱ��Ҫ����һ���̶��Ķ˿ںţ��ͻ��˲���ͨ�����
                �˿ڽ������ӡ�
                ����ö˿ڱ���ǰ����ϵͳ����������ʹ���ˣ���ô����ʵ�������׳��쳣:
                java.net.BindException:address already in use
                ���쳣:��ַ��ʹ����
             */
            System.out.println("�������������~~~");
            serverSocket = new ServerSocket(8088);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        try {
            /*
                ServerSocket��accept������һ������������
                ��ʼ�ȴ��ͻ��˵����ӣ�һ��һ���ͻ���ͨ���˿ڽ������ӣ���ʱaccept����
                ����������һ��Socketʵ����ͨ����ʵ��������ÿͻ��˽��н�����
                �൱���ǽӵ绰�Ķ�����
                ��������:���ú󣬳����"��ס"������ִ���ˡ�
             */
            while (true) {
                System.out.println("��������������ȴ��ͻ�������~");
                Socket socket = serverSocket.accept();
                System.out.println("������");
                //����һ���߳�������ͻ��˵Ľ���

                ClientHandler clientHandler = new ClientHandler(socket);
                Thread thread = new Thread(clientHandler);
                thread.start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                serverSocket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private class ClientHandler implements Runnable {
        private Socket socket;
        private String host;

        public ClientHandler(Socket socket) {
            this.socket = socket;
            host = socket.getInetAddress().getHostAddress();
        }

        @Override
        public void run() {
            PrintWriter pw = null;
            try {
                //��������ȡ��Ϣ
                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
                //����������Է�����Ϣ
                OutputStream os = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(os, StandardCharsets.UTF_8);
                BufferedWriter bw = new BufferedWriter(osw);
                pw = new PrintWriter(bw, true);

                //������������빲������allOut��
                //����������
                synchronized (Server.this) {
                    //allOut = Arrays.copyOf(allOut, allOut.length + 1);
                    //allOut[allOut.length - 1] = pw;
                    allOut.add(pw);
                }
                sendMessage(host+"�����ˣ���ǰ��������"+allOut.size());

                String line;
                //Scanner scanner= new Scanner(line);
                while ((line = br.readLine()) != null) {
                    System.out.println(host + "������Ϣ��" + line);
                    //����allOut���飬����Ϣ�������пͻ���
                    sendMessage(host + "������Ϣ��" + line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                synchronized (Server.this) {
//                    for (int i = 0; i < allOut.length; i++) {
//                        if (allOut[i] == pw) {
//                            allOut[i] = allOut[allOut.length - 1];
//                            allOut = Arrays.copyOf(allOut, allOut.length - 1);
//                            break;
//                        }
//                    }
                    allOut.remove(pw);
                }
                sendMessage(host+"�����ˣ���ǰ����������"+allOut.size());
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        /**
         * ������������Ϣ���͸�������
         */
        private void sendMessage(String line) {
            synchronized (Server.this){
            //�������Ҫ�пͻ������������ѣ������������仰
            //System.out.println(line);
            //����allOut���飬����Ϣ�������пͻ���
//            for (int i = 0; i < allOut.length; i++) {
//                allOut[i].println(line);
//            }
                for (PrintWriter printWriter:allOut) {
                    printWriter.println();
                }
            }
        }
    }
}
