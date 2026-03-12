package org.example.basic_server;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
        public static void main(String[] args) {
                try {
                        System.out.println("Starting the server.......");

                        ServerSocket ss = new ServerSocket(6666);
                        System.out.println("Server started.........Listening on port 6666");

                        Socket s = ss.accept();
                        System.out.println("Client accepted");

                        DataInputStream d = new DataInputStream(s.getInputStream());
                        String str = d.readUTF();

                        System.out.println("Message: " + str);
                        System.out.println("Message: " + ss.getLocalSocketAddress());

                        ss.close();
                } catch (Exception e){
                        e.printStackTrace();
                }
        }
}