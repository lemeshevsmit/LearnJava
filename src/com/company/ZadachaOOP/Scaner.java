package com.company.ZadachaOOP;

public class Scaner implements Gadget, Scanning {
    private String name;
    private String id;

    public Scaner(String id, String name) {
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
    public void scan() {
        start();
        System.out.println("Идет сканирование....");
        stop();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
