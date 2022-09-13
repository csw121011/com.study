package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.*;

/*
聊天室服务端
 */
public class Server {
    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

    /*
     java.net.ServerSocket
     ServerSocket是运行在服务端上的。其主要有两个作用
     1:向服务端申请服务端口(客户端Socket就是通过这个端口与服务端建立连接的)
     2:监听服务端口，一旦客户端连接会立即创建一个Socket，通过该Socket与客户端交互
     如果我们将Socket比喻为"电话"，那么ServerSocket相当于"总机"
     */
    private ServerSocket serverSocket;
    //private PrintWriter[] allOut = {};
    private Collection<PrintWriter> allOut = new ArrayList<PrintWriter>();

    public Server() {
        try {
            /*
                ServerSocket在创建的时候要申请一个固定的端口号，客户端才能通过这个
                端口建立连接。
                如果该端口被当前操作系统中其他程序使用了，那么这里实例化会抛出异常:
                java.net.BindException:address already in use
                绑定异常:地址被使用了
             */
            System.out.println("正在启动服务端~~~");
            serverSocket = new ServerSocket(8088);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        try {
            /*
                ServerSocket的accept方法是一个阻塞方法。
                开始等待客户端的连接，一旦一个客户端通过端口建立连接，此时accept方法
                会立即返回一个Socket实例。通过该实例可以与该客户端进行交互。
                相当于是接电话的动作。
                阻塞方法:调用后，程序就"卡住"不往下执行了。
             */
            while (true) {
                System.out.println("服务端已启动，等待客户端连接~");
                Socket socket = serverSocket.accept();
                System.out.println("已连接");
                //启动一个线程来处理客户端的交互

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
                //输入流获取消息
                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
                //输出流，给对方发消息
                OutputStream os = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(os, StandardCharsets.UTF_8);
                BufferedWriter bw = new BufferedWriter(osw);
                pw = new PrintWriter(bw, true);

                //将该输出流存入共享数组allOut中
                //将数组扩容
                synchronized (Server.this) {
                    //allOut = Arrays.copyOf(allOut, allOut.length + 1);
                    //allOut[allOut.length - 1] = pw;
                    allOut.add(pw);
                }
                sendMessage(host+"上线了，当前在线人数"+allOut.size());

                String line;
                //Scanner scanner= new Scanner(line);
                while ((line = br.readLine()) != null) {
                    System.out.println(host + "发来消息：" + line);
                    //遍历allOut数组，将消息发给所有客户端
                    sendMessage(host + "发来消息：" + line);
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
                sendMessage(host+"下线了，当前在线人数："+allOut.size());
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        /**
         * 创建方法将消息发送给所有人
         */
        private void sendMessage(String line) {
            synchronized (Server.this){
            //服务端若要有客户端上下线提醒，则加上下面这句话
            //System.out.println(line);
            //遍历allOut数组，将消息发给所有客户端
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
