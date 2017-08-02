package com.gorg.cdi;


import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;

@ApplicationScoped
public class CdiProducer {


    @Produces @Default
    public CdiService getCdiService() {
        return new CdiService();
    }

}
