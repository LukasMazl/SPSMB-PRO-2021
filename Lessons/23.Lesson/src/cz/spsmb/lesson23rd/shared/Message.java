package cz.spsmb.lesson23rd.shared;

public class Message {

    private String command;
    private String data;

    public Message() {
    }

    public Message(String command, String data) {
        this.command = command;
        this.data = data;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
