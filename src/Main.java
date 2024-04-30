import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Connecting a socket for communication");
        ServerSocket mySocket = new ServerSocket(1000);
        Socket actualSocket = mySocket.accept();
        InputStream in = actualSocket.getInputStream();
        ObjectInputStream objIn = new ObjectInputStream(in);
        System.out.println("Communicating");
        Object inMessage = objIn.readObject();
        System.out.println(inMessage);
    }
        }






