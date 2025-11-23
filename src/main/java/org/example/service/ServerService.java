package org.example.service;

import org.example.model.Request;
import org.example.model.ServerSide;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ServerService {
    private final static ServerSide serverSide = new ServerSide();
    private final static Request request = null;

    public void handleGetRequest(String requestStr){
        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(serverSide.getClientSocket().getInputStream()))
        )
        {

        } catch (Exception e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
