package phoneapp;

public class Message {

    private String getMessage;

    public Message(String getMessage) {
        this.getMessage = getMessage;
    }

    public String getGetMessage() {
        return getMessage;
    }

    @Override
    public String toString() {
        return getMessage;
    }

}
