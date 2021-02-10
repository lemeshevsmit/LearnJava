package com.company.ZadachaOOP;

public class Printer implements Gadget{
    private String name = "";
    private int id =0;

    public Printer(int id, String name) {
      this.name = name;
      this.id = id;
    }

    @Override
    public void start() {
        System.out.println("Gadget: "+ name + " start working...");
    }

    @Override
    public void stop() {
        System.out.println("Gadget: "+ name + " stop working.....");
    }

    @Override
    public void finctioncsaner() {

    }

    @Override
    public void finctionprint() {
        start();
        System.out.println("Идет струевая печать.....");
        stop();
    }
}
