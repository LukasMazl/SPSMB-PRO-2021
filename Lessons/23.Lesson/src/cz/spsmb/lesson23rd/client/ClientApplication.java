package cz.spsmb.lesson23rd.client;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ClientApplication {

    public static void main(String[] args) throws IOException {
       Socket socket = new Socket("localhost", 8000);
       OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
       outputStreamWriter.write("NEW_USER\n\n");
       outputStreamWriter.write("data");
       outputStreamWriter.flush();
       outputStreamWriter.close();
    }
}
