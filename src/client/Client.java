package client;

import java.io.*;
import java.net.Socket;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) throws IOException {

        //Socket socket = new Socket(args[0], Integer.parseInt(args[1]));


        Socket socket = new Socket("localhost", 32000);
        System.out.println("connect to server");

        OutputStream output = socket.getOutputStream();
        PrintWriter writer = new PrintWriter(output, true);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter text: ");
        String str = reader.readLine();
        writer.println(str);

        InputStream input = socket.getInputStream();
        BufferedReader serverReader = new BufferedReader(new InputStreamReader(input));

        String response = serverReader.readLine();
        System.out.println("Response from server: reveres " + response);



        socket.close();
    }


}
