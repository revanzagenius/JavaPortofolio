import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
public class MyClient2 {

	public static void main(String[] args) {	
	// String i,n = args[0];	
		try(Socket socket = new Socket(args[0], Integer.parseInt(args[1]))){//di gunakan untuk mengubah int menjadi string.
			BufferedReader echoes = new BufferedReader(
			new InputStreamReader(socket.getInputStream()));
			PrintWriter stringToEcho = new PrintWriter(socket.getOutputStream(), true);
			
			Scanner scanner = new Scanner(System.in);
			String echoString;
			
			do {
				System.out.println("Enter string to be echoed : ");
				echoString = scanner.nextLine();
				
				stringToEcho.println(echoString);
				if(!echoString.equals("exit")) {
				String response = echoes.readLine();
				System.out.println(response);
				}
			}while(!echoString.equals("exit"));
		}catch (IOException e) {
			System.out.println("Client error : "+e.getMessage());
		}

	}

}
