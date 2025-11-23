package org.example.model;

public class Response {
    private String responseCode;
    private String responseBody;

    public Response(String responseCode, String responseBody){
        this.responseCode = responseCode;
        this.responseBody = responseBody;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(String responseBody) {
        this.responseBody = responseBody;
    }

    @Override
    public String toString() {
        return "Response{" +
                "responseCode='" + responseCode + '\'' +
                ", responseBody='" + responseBody + '\'' +
                '}';
    }
}
