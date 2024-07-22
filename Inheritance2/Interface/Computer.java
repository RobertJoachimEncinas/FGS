package Inheritance2.Interface;

public class Computer implements Client, Server {

    @Override
    public void sendResponse(Client receiver, String response) {
        receiver.receiveResponse(response);
    }

    @Override
    public void receiveRequest(Client sender, String request) {
        this.sendResponse(sender, "Received: " + request);
    }

    @Override
    public void sendRequest(Server server, String request) {
        server.receiveRequest(this, request);
    }

    @Override
    public void receiveResponse(String response) {
        System.out.println(response);
    }
}
