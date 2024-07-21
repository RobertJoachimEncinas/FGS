package Inheritance2.Interface;

public class HttpServer implements Server {

    @Override
    public void sendResponse(Client receiver, String response) {
        receiver.receiveResponse(response);
    }

    @Override
    public void receiveRequest(Client sender, String request) {
        this.sendResponse(sender, "Received: " + request);
    }
}
