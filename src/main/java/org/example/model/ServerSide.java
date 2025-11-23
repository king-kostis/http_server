package org.example.model;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide {
    private Socket clientSocket;
    private ServerSocket serverSocket;
    private InputStream in;
    private OutputStream out;

    public ServerSide() {
        try {
            this.serverSocket = new ServerSocket(4199);
            this.clientSocket = serverSocket.accept();
            this.in = clientSocket.getInputStream();
            this.out = clientSocket.getOutputStream();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }

    public Socket getClientSocket() {
        return clientSocket;
    }

    public OutputStream getOut() {
        return out;
    }

    public ServerSocket getServerSocket() {
        return serverSocket;
    }

    public InputStream getIn() {
        return in;
    }

    public void setIn(InputStream in) {
        this.in = in;
    }
}
