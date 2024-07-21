package Inheritance2.Interface;

public interface Server {
    public void sendResponse(Client receiver, String response);
    public void receiveRequest(Client sender, String request);
}
