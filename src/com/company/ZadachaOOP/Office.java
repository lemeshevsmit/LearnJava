package com.company.ZadachaOOP;

import java.awt.*;
import java.util.ArrayList;

public class Office {
    private  int numberOffice = 0;
    OfficeWorker person[];
    private Object gadget;

    Office(int id){
        this.numberOffice = id;
    }
    public void addGadget(Object o) {
        this.gadget = o;
    }

    public void addPersonToOffice(int count) {
        person=new OfficeWorker[count];
        for (int i = 0; i < count; i++) {
            person[i]= OfficeWorker.workers.get(i);
            OfficeWorker.workers.remove(i);
        }
    }
//    public void displayOffice() {
//
//    }
//
    public void displayWorkers() {
        System.out.println("Роботники в кабинете: ");
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].getFirstName() + " " + person[i].getLastName()+ " " + person[i].getSecondName());
        }
    }
}
