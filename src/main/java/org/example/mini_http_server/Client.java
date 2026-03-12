package org.example.mini_http_server;

import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 6667);

            OutputStreamWriter ow = new OutputStreamWriter(s.getOutputStream());
            ow.write("Hello!");
            ow.flush();
            ow.close();
            s.close();
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
