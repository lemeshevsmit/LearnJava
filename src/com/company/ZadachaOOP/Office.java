package com.company.ZadachaOOP;

import java.awt.*;
import java.util.ArrayList;

public class Office {
    private  int numberOffice = 0;
    private OfficeWorker person[];
    private Printer printer;
    private Scaner scaner;
    private Combine combine;

    Office(int id){
        this.numberOffice = id;
    }
    public void addGadget(Object o) {

         scaner = (Scaner) o;

    }

    public void addPersonToOffice(int count) {
        for (int i = 0; i < count; i++) {
            person[i]= OfficeWorker.workers.get(i);
            OfficeWorker.workers.remove(i);
        }
    }

    public Object getGadget() {
        if (printer!=null) return this.printer;
        else
        if (scaner!=null) return this.scaner;
        else return this.combine;
    }
//    public void displayOffice() {
//
//    }
//
//    public void displayWorkers() {
//        System.out.println("Роботники в кабинете: ");
//        for (int i = 0; i < person.length; i++) {
//            System.out.println(person[i].getFirstName() + " " + person[i].getLastName()+ " " + person[i].getSecondName());
//        }
//    }
}
