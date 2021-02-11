package com.company.ZadachaOOP;

public class Scaner implements Gadget, Scanning{
    private String name ;
    private int id;

    public Scaner(int id, String name) {
        this.name = name;
        this.id = id;
    }
    @Override
    public void start() {
        System.out.println("Gadget: "+ this.name + " start working...");
    }

    @Override
    public void stop() {
        System.out.println("Gadget: "+ this.name + " stop working.....");
    }


    @Override
    public void scan() {
        start();
        System.out.println("Идет сканирование....");
        stop();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
