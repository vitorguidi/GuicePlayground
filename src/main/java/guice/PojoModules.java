package guice;

import client.Client;
import client.IntegerClient;
import client.StringClient;
import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;

public class PojoModules extends AbstractModule {
    @Override
    protected void configure() {
        bind(new TypeLiteral<Client<Integer>>(){}).to(IntegerClient.class);
        bind(new TypeLiteral<Client<String>>(){}).to(StringClient.class);
    }

}
