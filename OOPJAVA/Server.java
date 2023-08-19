import java.io.IOException;
import java.net.ServerSocket;

public class Server {
    private static ServerSocket serverSocket;

    public static void main(String[] args) {
        try(ServerSocket serveSocket= new ServerSocket(5005)){
            while(true){
                new Echoer(serverSocket.accept()).start();
                System.out.println("Client connected ! ");
            }
        }catch(IOException e){
            System.out.println("Server Exception" + e.getMessage());
        }
    }
    
}
