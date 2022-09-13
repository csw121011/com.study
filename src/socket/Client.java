package socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * �����ҿͻ���
 */
public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
    /**
     * java.net.Socket
     * Socket��װ��TCPЭ���ͨѶϸ�ڣ�ʹ�������Ժͷ���˽���TCP���ӣ���������������
     * ��д������ݽ�����
     */
    private Socket socket ;

    public Client() {
        try {
            /*
            ʵ����socket�Ĺ��췽��
            Socket(String host,int port)
            ���������ʵ����Socket�Ĺ��̾��������˽������ӵĹ��̡�
                ����1:����˵�IP��ַ
                ����2:����˿����ķ���˿�
                ����ͨ������˵�IP�����ҵ������Ϸ�������ڵļ������ͨ���˿ںſ����ҵ�
                �û����ϵķ����Ӧ�ó���Ӷ���֮�������ӡ�
             */
            System.out.println("�������ӷ�����������");
            //localhost��ʾ������ip��ַ
            socket = new Socket("localhost",8088);
            System.out.println("���ӷ������ɹ���");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start() {
        Scanner s = new Scanner(System.in);
        try {
            //����һ�����ڶ�ȡ����˷��͹�����Ϣ���߳�
            ServerHandler serverHandler = new ServerHandler();
            Thread t = new Thread(serverHandler);
            t.start();
            //ͨ��socket��ȡ�������������˷�����Ϣ
            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw, true);
            //ͨ��socket��ȡ����������ȡ����˷�������Ϣ

            while (true) {
                String line = s.nextLine();
                if ("exit".equals(line)){
                    break;
                }
                pw.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();//socket.close()һ���þͻ�ر�������֮��������
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private class ServerHandler implements Runnable{
        @Override
        public void run() {
            try{
                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is,StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);

                String line;
                while ((line = br.readLine()) != null){
                    System.out.println(line);
                }

            }catch (IOException e){

            }
        }
    }
}
