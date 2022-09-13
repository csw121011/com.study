package socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client01 {
    public static void main(String[] args) {
        Client01 client = new Client01();
        client.start();
    }
    private Socket socket;

    public Client01() {
        try {
            System.out.println("正在连接服务端~~");
            socket = new Socket("localhost", 8088);
            System.out.println("服务器连接成功~~");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void start() {
        Scanner s = new Scanner(System.in);
        try {
            ReadMessage readmessage = new ReadMessage();
            Thread thread = new Thread(readmessage);
            thread.start();

            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true);
            while (true) {
                String line = s.nextLine();
                if ("exit".equals(line)) {
                    break;
                }
                pw.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private class ReadMessage implements Runnable {
        @Override
        public void run() {
            try {
                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is,StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
                String string ;
                while ((string = br.readLine()) != null) {
                    System.out.println(string);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


