package Inheritance2.Interface;

public class HttpClient implements Client {

    @Override
    public void sendRequest(Server server, String request) {
        server.receiveRequest(this, request);
    }

    @Override
    public void receiveResponse(String response) {
        System.out.println(response);
    }
    
}
