package org.example.model;

public class Request {
    private String requestHeader;
    private String requestBody;

    public Request(String requestHeader, String requestBody){
        this.requestHeader = requestHeader;
        this.requestBody = requestBody;
    }

    public String getRequestHeader(){
        return requestHeader;
    }

    public void setRequestHeader(String requestHeader){
        this.requestHeader = requestHeader;
    }

    public String getRequestBody(){
        return requestBody;
    }

    public void setRequestBody(String requestBody){
        this.requestBody = requestBody;
    }
}
