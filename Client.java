package ExamWeek5;
import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket(args[0], Integer.parseInt(args[1]))) {
            BufferedReader echoes = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter stringToEcho = new PrintWriter(socket.getOutputStream(), true);

            Scanner input = new Scanner(System.in);
            // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String echoString;

            do {
                System.out.println("Masukkan kalimat: ");
                echoString = input.nextLine();

                stringToEcho.println(echoString);
                if (!echoString.equals("exit")) {
                    String response = echoes.readLine();
                    System.out.println(response);
                }
            } while (!echoString.equals("exit"));

            // input.close();
        } catch (IOException e) {
            System.out.println("Client Error: " + e.getMessage());
        }
    }
}