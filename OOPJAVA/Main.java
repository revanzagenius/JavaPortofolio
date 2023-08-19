package OOPJAVA.JavaNetwork.JavaInputNetwork;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Socket sokap = new Socket("localhost",5005)){
            BufferedReader echoes = new BufferedReader(
                new InputStreamReader(sokap.getInputStream()));
            PrintWriter stringToEcho = new PrintWriter(sokap.getOutputStream(),true);

            Scanner scanner = new Scanner(System.in);
            String echoString;
            String response;

            do{
                System.out.println("Masuakan String untuk menggema : ");
                echoString = scanner.nextLine();

                stringToEcho.println(echoString);
                if(!echoString.equals("exit")){
                        response = echoes.readLine();
                        System.out.println(response);
                }
            }while(!echoString.equals("exit"));
        }catch(IOException e){
            System.out.println("Client Eror:" +e.getMessage());
        }
    }
    
}
