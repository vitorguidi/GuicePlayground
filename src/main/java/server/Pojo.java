package server;

import client.Client;
import client.ClientWrapper;
import com.google.gson.Gson;
import com.google.inject.Guice;
import com.google.inject.Injector;
import guice.PojoModules;


public class Pojo {
    public  enum Dados {
        x, y;
    };
    public static class test {
        int a;
        int b;
        test(int x, int y) {
            this.a=x;
            this.b=y;
        }
    }
    private static Gson gson = new Gson();
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new PojoModules());
        test X = new test(2,3);
        ClientWrapper client = injector.getInstance(ClientWrapper.class);
        System.out.println(gson.toJson(X));
        System.out.println(gson.toJson(Dados.x));
        client.hello();
    }
}
