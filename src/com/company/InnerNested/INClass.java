package com.company.InnerNested;

public class INClass {
    static class InClass1 {
        int inSD;

        //Constructor InClass1
        InClass1() {
            inSD = 555;
        }

        int getinSD() {
            return inSD;
        }
    }

    static InClass1 inClass1 = new InClass1() {
        int getinSD() {
            return inSD;
        }
    };

    public static void main(String[] args) {
        System.out.println(INClass.inClass1.getinSD());
        System.out.println(INClass.inClass1.inSD);

    }
}
