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


    public int findGreat(){
        int greatest = Integer.MIN_VALUE;
        int [] data = someCDIDAO.getData();
        for (int value : data) {
            if (value > greatest){
                greatest = value;
            }
        }
        return greatest;
    }
}
