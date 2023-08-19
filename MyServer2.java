package ExamWeek5;
import java.io.IOException;
import java.net.ServerSocket;

public class MyServer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(ServerSocket serverSocket = new ServerSocket(5010)){
			while(true) {
				new Echoer(serverSocket.accept()).start();
				System.out.println("Client connected!");
			}
		}catch(IOException e) {
			System.out.println("Server exception "+e.getMessage());
		}

	}

}
