package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/*
�����ҷ����
 */
public class Server {
    /*
     java.net.ServerSocket
     ServerSocket�������ڷ�����ϵġ�����Ҫ����������
     1:�������������˿�(�ͻ���Socket����ͨ������˿������˽������ӵ�)
     2:��������˿ڣ�һ���ͻ������ӻ���������һ��Socket��ͨ����Socket��ͻ��˽���
     ������ǽ�Socket����Ϊ"�绰"����ôServerSocket�൱��"�ܻ�"
     */
    private ServerSocket serverSocket;

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
            System.out.println("�����������ϣ���");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start(){
        Scanner s = new Scanner(System.in);
        try {
            /*
                ServerSocket��accept������һ������������
                ��ʼ�ȴ��ͻ��˵����ӣ�һ��һ���ͻ���ͨ���˿ڽ������ӣ���ʱaccept����
                ����������һ��Socketʵ����ͨ����ʵ��������ÿͻ��˽��н�����
                �൱���ǽӵ绰�Ķ�����
                ��������:���ú󣬳����"��ס"������ִ���ˡ�
             */
            while (true) {
                System.out.println("�ȴ��ͻ�������~");
                Socket socket = serverSocket.accept();
                System.out.println("һ���ͻ����������ϣ�");
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);
            String line;
            //Scanner scanner= new Scanner(line);
            while ((line = br.readLine()) != null){
                System.out.println("�ͻ��˷�����Ϣ��"+line);
            }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                serverSocket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }
}