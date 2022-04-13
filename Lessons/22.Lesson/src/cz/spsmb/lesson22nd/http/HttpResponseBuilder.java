package cz.spsmb.lesson22nd.http;

import java.util.HashMap;
import java.util.Map;

public class HttpResponseBuilder {

    public static final String NEW_LINE = "\n\r";

    private String httpVersion;
    private int statusCode;
    private Map<String, String> headerParams;
    private String body;

    public HttpResponseBuilder() {
        this.headerParams = new HashMap<>();
    }

    public HttpResponseBuilder setHttpVersion(String httpVersion) {
        this.httpVersion = httpVersion;
        return this;
    }

    public HttpResponseBuilder setStatusCode(int statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    public HttpResponseBuilder setBody(String body) {
        this.body = body;
        return this;
    }

    public HttpResponseBuilder addHeaderParam(String key, String value) {
        this.headerParams.put(key, value);
        return this;
    }

    public String build() {
        StringBuilder httpResponseBuilder = new StringBuilder();
        httpResponseBuilder.append(httpVersion).append(" ").append(statusCode).append(NEW_LINE);

        for (Map.Entry<String, String> entry : headerParams.entrySet()) {
            httpResponseBuilder.append(entry.getKey()).append(": ").append(entry.getValue()).append(NEW_LINE);
        }

        if(body != null && !body.isEmpty()) {
            httpResponseBuilder.append(NEW_LINE);
            httpResponseBuilder.append(body);
        }
        return httpResponseBuilder.toString();
    }
}
