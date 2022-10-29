package client;

public class StringClient implements Client<String> {
    public StringClient(){}
    public String get() {
        return "oi";
    }
}
