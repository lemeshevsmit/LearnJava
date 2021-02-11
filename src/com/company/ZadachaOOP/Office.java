package com.company.ZadachaOOP;

import java.awt.*;
import java.util.ArrayList;

public class Office {
    private  int numberOffice;
    private OfficeWorker person[];
    private Object gadget;

    Office(int id){
        this.numberOffice = id;
    }

    public void addGadget(Object o) {
        this.gadget = o;
    }

    public void addPersonToOffice(int count) {
        this.person=new OfficeWorker[count];
        for (int i = 0; i < count; i++) {
            this.person[i]= OfficeWorker.workers.get(i);
            OfficeWorker.workers.remove(i);
        }
    }

    public int getNumberOffice() {
        return numberOffice;
    }

    public OfficeWorker[] getPerson() {
        return person;
    }

    public Object getGadget() {
        return gadget;
    }
}
