package org.example.mini_http_server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServerImpl {



    private static String getRequestStr(Socket s) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line;
        String requestStr = "";
        while((line = br.readLine()) != null){
            requestStr += line;
        }
        return requestStr;
    }

    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6667);
            System.out.println("Server started");
            Socket s = ss.accept();
            System.out.println("Connected to client\n");

            System.out.println(getRequestStr(s));


            s.close();
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
