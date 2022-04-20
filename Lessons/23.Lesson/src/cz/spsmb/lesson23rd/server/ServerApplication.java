package cz.spsmb.lesson23rd.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerApplication {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8000);
        Socket socket = serverSocket.accept();
        Scanner scanner = new Scanner(socket.getInputStream());

        while (scanner.hasNext()) {
            String line = scanner.next();
            System.out.println(line);
        }
    }
}
