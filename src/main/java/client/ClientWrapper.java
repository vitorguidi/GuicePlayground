package client;

import com.google.inject.Inject;

public class ClientWrapper {
    @Inject
    Client<Integer> intClient;
    @Inject
    Client<String> stringClient;
    public void hello() {
        System.out.println(stringClient.get());
        System.out.println(intClient.get());
    }

}
