package socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 聊天室客户端
 */
public class Client {
    /**
     * java.net.Socket
     * Socket封装了TCP协议的通讯细节，使用它可以和服务端建立TCP连接，并基于两个流的
     * 读写完成数据交换。
     */
    private Socket socket ;

    public Client() {
        try {
            /*
            实例化socket的构造方法
            Socket(String host,int port)
            这个构造器实例化Socket的过程就是与服务端建立连接的过程。
                参数1:服务端的IP地址
                参数2:服务端开启的服务端口
                我们通过服务端的IP可以找到网络上服务端所在的计算机。通过端口号可以找到
                该机器上的服务端应用程序从而与之建立连接。
             */
            System.out.println("正在连接服务器。。。");
            //localhost表示本机的ip地址
            socket = new Socket("localhost",8088);
            System.out.println("连接服务器成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start() {
        Scanner s = new Scanner(System.in);
        try {
            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw, true);
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
                socket.close();//socket.close()一调用就会关闭所有与之相连的流
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}
