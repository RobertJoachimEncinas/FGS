package Inheritance2.Interface;

public interface Client {
    public void sendRequest(Server server, String request);
    public void receiveResponse(String response);
}
