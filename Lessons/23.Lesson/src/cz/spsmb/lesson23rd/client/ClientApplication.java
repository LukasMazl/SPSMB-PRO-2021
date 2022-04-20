package cz.spsmb.lesson23rd.client;

import cz.spsmb.lesson23rd.shared.Message;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientApplication {

    public static void writeObjectToOutputStream(OutputStream outputStream) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        Message message = new Message();
        message.setCommand("SEND_DATA");
        message.setData("data data need more data");

        objectOutputStream.writeObject(message);
        objectOutputStream.flush();
        objectOutputStream.close();
    }

    public static void writeStringToOutputStream(OutputStream outputStream) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        outputStreamWriter.write("NEW_USER\n\n");
        outputStreamWriter.write("data");
        outputStreamWriter.flush();
        outputStreamWriter.close();
    }

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8000);
        writeObjectToOutputStream(socket.getOutputStream());
       // writeStringToOutputStream(socket.getOutputStream());
    }
}
