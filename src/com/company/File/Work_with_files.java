package com.company.File;

import java.io.*;

public class Work_with_files {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Smit\\IdeaProjects\\LearnJava\\src\\com\\company\\File\\text_file.txt");

        if (!file.exists()) {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (bufferedReader.ready()) {
                System.out.println(bufferedReader.readLine());
            }
        } else System.out.println("You must create file!!");
    }
}
