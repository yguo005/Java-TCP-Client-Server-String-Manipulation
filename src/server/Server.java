package server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args ) throws IOException {

        ServerSocket serSock = new ServerSocket(32000);
        System.out.println("Server listening to port 32000");

        while (true) {
            Socket socket = serSock.accept();
            System.out.println("client connected");

            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            OutputStream output = socket.getOutputStream();

            PrintWriter writer = new PrintWriter(output, true);

            String str = reader.readLine();
            String reverseStr = new StringBuilder(str).reverse().toString();
            String result = convertCase(reverseStr);

            writer.println(result);

            socket.close();

            System.out.println("exit");
            break;
        }

        serSock.close();
    }

    private static String convertCase(String input) {

        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++){
            char c = chars[i];
            if (Character.isUpperCase(c)){
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)){
                chars[i] = Character.toUpperCase(c);
            }

        }
        return new String(chars);
    }



}
