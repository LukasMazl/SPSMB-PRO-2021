package cz.spsmb.lesson22nd.http;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.sql.SQLOutput;

public class HttpThread extends Thread {

    private Socket socket;

    public HttpThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            String httpRequest = readHttpRequest(socket.getInputStream());
            System.out.println(httpRequest);
            // TODO Domaci ukol
            // String filePath = getFilePath(httpRequest);
            // String fileContent = getFileContent(filePath);
            HttpResponseBuilder httpResponseBuilder = new HttpResponseBuilder()
                    .setHttpVersion("HTTP/1.1")
                    .setStatusCode(200)
                    .addHeaderParam("Content-type", "text/html");
            //        .setBody(fileContent);

            System.out.println(httpResponseBuilder.build());
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
            outputStreamWriter.write(httpResponseBuilder.build());
            outputStreamWriter.flush();
            outputStreamWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
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
