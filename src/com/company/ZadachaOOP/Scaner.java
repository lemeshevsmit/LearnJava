package com.company.ZadachaOOP;

public class Scaner implements Gadget{
    private String name = "";
    private int id =0;

    public Scaner(int id, String name) {
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
    public void finctionprint() {

    }

    @Override
    public void finctioncsaner() {
        start();
        System.out.println("Идет сканирование....");
        stop();
    }
}
