package Inheritance2.Interface;

public class Main {
    public static void main(String[] args) {
        Client client = new HttpClient();
        Client computer1 = new Computer();
        Server computer2 = new Computer();
        Server server = new HttpServer();

        System.out.println("Is client an instance of HttpClient? " + (client instanceof HttpClient));
        System.out.println("Is client an instance of Client? " + (client instanceof Client));
        System.out.println("Is server an instance of Server? " + (server instanceof Server));
        System.out.println("Is server an instance of HttpServer? " + (server instanceof HttpServer));
        System.out.println("Is computer1 an instance of Server? " + (computer1 instanceof Server));
        System.out.println("Is computer2 an instance of Client? " + (computer2 instanceof Client));

        client.sendRequest(server, "/get");
        client.sendRequest((Server) computer1, "request to Server typecasted computer");
        client.sendRequest((Computer) computer1, "request to Computer typecasted computer");
        client.sendRequest(computer2, "request to a server computer");
    }
}
