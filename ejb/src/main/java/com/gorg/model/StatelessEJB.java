package com.gorg.model;

import lombok.extern.slf4j.Slf4j;

import javax.ejb.Init;
import javax.ejb.Stateless;

/**
 * Created by mkra on 13-06-2017.
 */
@Slf4j
@Stateless()
public class StatelessEJB {

    public String method() {
        return "This is stateless ejb method";
    }


    @Init
    private void init() {
        LOGGER.debug("Initializing the StatelessEJB");
    }
}
