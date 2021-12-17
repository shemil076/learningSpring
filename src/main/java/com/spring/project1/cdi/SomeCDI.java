package com.spring.project1.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCDI {

    @Inject
    SomeCDIDAO someCDIDAO;

    public SomeCDIDAO getSomeCDIDAO() {
        return someCDIDAO;
    }

    public void setSomeCDIDAO(SomeCDIDAO someCDIDAO) {
        this.someCDIDAO = someCDIDAO;
    }

}
