package cz.spsmb.lesson21st;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Application {

    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket serverSocket = new ServerSocket(80);
        Socket socket = serverSocket.accept();

        String httpRequest = readHttpRequest(socket.getInputStream());
        System.out.println(httpRequest);

        HttpResponseBuilder httpResponseBuilder = new HttpResponseBuilder()
                .setHttpVersion("HTTP/1.1")
                .setStatusCode(200)
                .addHeaderParam("Content-type", "text/html")
                .setBody("<html><body><h1>Hello</h1></body></html>");

        System.out.println(httpResponseBuilder.build());
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
        outputStreamWriter.write(httpResponseBuilder.build());
        outputStreamWriter.flush();
        outputStreamWriter.close();
    }

    private static String readHttpRequest(InputStream inputStream) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        do {
            while (inputStream.available() > 0) {
                stringBuilder.append((char) inputStream.read());
            }
        } while (stringBuilder.length() == 0);

        return stringBuilder.toString();
    }
}
