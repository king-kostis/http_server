package org.example.basic_server;

import java.io.DataOutputStream;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 6666);

            DataOutputStream d = new DataOutputStream(s.getOutputStream());

            d.writeUTF("Hello! this is a request");

            d.flush();
            d.close();
            s.close();
        } catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
