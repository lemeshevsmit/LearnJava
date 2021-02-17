package com.company.ZadachaOOP;

public class Printer implements Gadget, Printing {
    private String name;
    private String id;

    public Printer(String id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void start() {
        System.out.println("Gadget: " + this.name + " start working...");
    }

    @Override
    public void stop() {
        System.out.println("Gadget: " + this.name + " stop working.....");
    }


    @Override
    public void print() {
        start();
        System.out.println("Идет струевая печать.....");
        stop();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
