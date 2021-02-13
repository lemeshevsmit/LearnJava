package com.company.Miner;

import java.util.Random;
import java.util.Scanner;
public class Miner {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введи размер массива:");
        int mas_i = sc.nextInt();
        int mas_j = sc.nextInt();
        char[][] masiv = new char[mas_i][mas_j];
        fillMatrix(masiv,mas_i,mas_j);
        System.out.println("");
        char[][] numberArray = new char[mas_i][mas_j];

        for (int i = 0; i < masiv.length; i++) {
        for (int j = 0; j < masiv[i].length;  j++) {
            numberArray[i][j] = checkAdjacentField(i, j, masiv);
        }
    }
        for (int i = 0; i < masiv.length; i++) {
            for (int j = 0; j < masiv[i].length;  j++) {
                if (masiv[i][j]=='*') {
                    numberArray[i][j]='*';
                    System.out.print(numberArray[i][j]+" ");
                } else System.out.print(numberArray[i][j]+" ");
            }
            System.out.println("");
        }
}
    public static void fillMatrix (char[][] matrix,int mas_i,int mas_j)
    {
        Random rnd = new Random(System.currentTimeMillis());
        for (int i=0;i<mas_i;i++)
        {
            for (int j=0;j<mas_j;j++)
            {
                if (rnd.nextInt(2)==0) matrix[i][j]='.';
                else matrix[i][j]='*';
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }

    private static char checkAdjacentField(int i, int j, char[][] ae) {
        int count = 0;
        if (j <= ae[i].length - 2) { // to the right
            count += ae[i][j + 1] == '*' ? 1 : 0;
        }
        if (j <= ae[i].length - 2 && i <= ae.length - 2) { // move to top right
            count += ae[i + 1][j + 1] == '*' ? 1 : 0;
        }
        if (j <= ae[i].length - 2 && i > 0) { // move to bottom right
            count += ae[i - 1][j + 1] == '*' ? 1 : 0;
        }
        if (j > 0) { // to the left
            count += ae[i][j - 1] == '*' ? 1 : 0;
        }
        if (j > 0 && i <= ae.length - 2) { // to top left
            count += ae[i + 1][j - 1] == '*' ? 1 : 0;
        }
        if (j > 0 && i > 0) { // to bottom left
            count += ae[i - 1][j - 1] == '*' ? 1 : 0;
        }
        if (i <= ae.length - 2) { // move to top
            count += ae[i + 1][j] == '*' ? 1 : 0;
        }
        if (i > 0) { // move top bottom
            count += ae[i - 1][j] == '*' ? 1 : 0;
        }
        String stringValue = String.valueOf(count);
        return stringValue.charAt(0);
    }
}