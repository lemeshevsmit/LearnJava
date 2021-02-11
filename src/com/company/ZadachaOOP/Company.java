package com.company.ZadachaOOP;

import java.awt.*;
import java.util.ArrayList;
public class Company {
    static private ArrayList<Office> offices = new ArrayList<Office>();
    static public void main(String[] args) {
        System.out.println("************************Gadget metods***************************");
        Printer printer1 = new Printer(1,"HP");
        Printer printer2 = new Printer(2,"Canon");
        Printer printer3 = new Printer(3,"Epson");
        Scaner scaner1 = new Scaner(1,"DvX");
        Scaner scaner2 = new Scaner(2,"MyScan");
        Scaner scaner3 = new Scaner(3,"GoodYear");
        Combine combine1 = new Combine(1,"Combine");
        Combine combine2 = new Combine(2,"HP machins");
        Combine combine3 = new Combine(3,"Canon3v1");
        printer1.print();
        printer3.print();
        scaner1.scan();
        scaner3.scan();
        combine1.copy();
        combine2.print();
        combine2.scan();
        System.out.println("************************Office info***************************");
        Office office1 = new Office(1);
        office1.addGadget(scaner2);
        office1.addPersonToOffice(3);
        offices.add(office1);

        Office office2 = new Office(2);
        office2.addGadget(printer1);
        offices.add(office2);

        Office office3 = new Office(3);
        office3.addGadget(combine2);
        office3.addPersonToOffice(2);
        offices.add(office3);

        Office office4 = new Office(4);
        office4.addGadget(scaner3);
        office4.addPersonToOffice(1);
        offices.add(office4);

        Office office5 = new Office(5);
        office5.addGadget(printer3);
        offices.add(office5);

        Office office6 = new Office(6);
        office6.addGadget(combine3);
        office6.addPersonToOffice(2);
        offices.add(office6);

        Office office7 = new Office(7);
        office7.addGadget(scaner1);
        office7.addPersonToOffice(1);
        offices.add(office7);

        Office office8 = new Office(8);
        office8.addGadget(printer2);
        office8.addPersonToOffice(1);
        offices.add(office8);
        printOffice();
        System.out.println("************************Workers info***************************");
        displayWorkers();
    }

    public static void printOffice()
    {
        for (int i = 0; i < offices.size(); i++) {
            System.out.printf("Кабинет №: " +offices.get(i).getNumberOffice() + "\n");
            System.out.println("Устройство в кабинете: "+ (offices.get(i).getGadget().getClass().getSimpleName()));
        }
    }

    public static void displayWorkers() {
        System.out.println("Роботники: ");
        OfficeWorker person;
        for (int i = 0; i < offices.size(); i++) {
            for (int j = 0; j < offices.get(i).getPerson().length; j++) {
                person= offices.get(i).getPerson()[j];
                System.out.println(person.getFirstName() + " " + person.getLastName()+ " " + person.getSecondName() + " сейчас в кабинете № " + offices.get(i).getNumberOffice() );
            }

        }
    }
}
