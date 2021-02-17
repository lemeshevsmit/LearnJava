package com.company.ZadachaOOP;

public class Combine implements Gadget, Printing, Scanning, Copyring {
    private String name;
    private String id;

    public Combine(String id, String name) {
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
        System.out.println("Идет лазерная печать.....");
        stop();
    }

    @Override
    public void scan() {
        start();
        System.out.println("Идет сканирование....");
        stop();
    }

    public void copy() {
        start();
        System.out.println("Идет копирование...");
        stop();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
