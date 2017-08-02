package com.gorg.model;

import com.gorg.cdi.CdiService;
import lombok.extern.slf4j.Slf4j;

import javax.ejb.Init;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Created by mkra on 13-06-2017.
 */
@Slf4j
@Stateless
public class StatelessEJB {

    @Inject
    CdiService cdiService;

    public String method() {
        return "This is stateless ejb method";
    }


    public String cdiMethod() {
        return cdiService.work();
    }

    @Init
    private void init() {
        LOGGER.debug("Initializing the StatelessEJB");
    }
}
