
import java.io.IOException;
import java.net.ServerSocket;

public class Main {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(Integer.parseInt(args[0]))) {
            while (true) {
                new Echoer(serverSocket.accept()).start();
                System.out.println("Client Connected !");
            }
        } catch (IOException e) {
            System.out.println("Server exception " + e.getMessage());
        }
    }
}