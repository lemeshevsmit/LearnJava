package com.company.ZadachaOOP;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Company {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Printer printer1 = new Printer(1,"HP");
        Printer printer2 = new Printer(2,"Canon");
        Printer printer3 = new Printer(3,"Epson");
        Scaner scaner1 = new Scaner(1,"DvX");
        Scaner scaner2 = new Scaner(2,"MyScan");
        Scaner scaner3 = new Scaner(3,"GoodYear");
        Combine combine1 = new Combine(1,"Combine");
        Combine combine2 = new Combine(2,"HP machins");
        Combine combine3 = new Combine(3,"Canon3v1");
//        printer1.finctionprint();
//        printer3.finctionprint();
//        printer2.finctioncsaner();
//        scaner1.finctioncsaner();
//        scaner2.finctioncsaner();
//        scaner3.finctionprint();
//        combine1.finctioncopy();
//        combine2.finctionprint();
//        combine3.finctioncsaner();
        Office office1 = new Office(0);
        office1.addGadget(scaner2);
        System.out.println(office1.getGadget());
        //office1.addPersonToOffice(3);

        //office1.displayWorkers();

    }
}
