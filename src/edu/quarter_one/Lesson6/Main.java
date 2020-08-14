package edu.quarter_one.Lesson6;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static String[] files = new String[] {
            "test1.txt",
            "test2.txt"
    };
    public static String[] texts = new String[] {
            "My name is Mia. I am eight. I go to school. I am a pupil. I am a pupil of the second form. I live in Moscow. I have got a big and friendly family. And I have got a lot of friends.",
            "I like holidays. They are funny. The holidays are New Year, Women’s Day, Victory Day, Christmas, Easter, Independence Day. These holidays are important for people. Birthday is my favourite holiday. I get a lot of presents on my birthday. I always invite my friends for my birthday. We have much fun."
    };
    public static String mergeFile = "test3.txt";
    public static String searchText = "Independence";
    public static String searchFolder = "c:/java/gb";

    public static void textWrite(String[] files, String[] texts, boolean action) {
        OutputStream out;
        try {
            for(int i = 0; i < files.length; i++) {
                FileOutputStream fos = new FileOutputStream(files[i], action);
                fos.write(texts[i].getBytes());
                fos.flush();
                fos.close();
                System.out.println(textRead(files[i]));
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static String textRead(String file_name) {
        InputStream in;
        StringBuilder str = new StringBuilder();

        try {
            Scanner scanner = new Scanner(new FileInputStream(file_name));
            while (scanner.hasNext()) {
                str.append(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str.toString();
    }

    public static void mergeFile(String[] files, String mergeFile) {
        InputStream in;
        OutputStream out;
        StringBuilder str = new StringBuilder();

        try {
            for(int i = 0; i < files.length; i++) {
                Scanner scanner = new Scanner(new FileInputStream(files[i]));
                while (scanner.hasNext()) {
                    str.append(scanner.nextLine());
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }


        try {
            FileOutputStream fos = new FileOutputStream(mergeFile);
            fos.write(str.toString().getBytes());
            fos.flush();
            fos.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }


    public static void main(String[] args) {
        textWrite(files, texts, false);
        mergeFile(files, mergeFile);

        System.out.println("\n");
        System.out.println("Поиск слова \"" + searchText + "\" в папке: " + searchFolder);

        File folder = new File(searchFolder);
        for (File file : folder.listFiles()) {
            if (file.isFile() && file.length() > 0) {
                if (textRead(file.getName()).indexOf(searchText) != - 1) {
                    System.out.println("найдено в файле: " + file.getName());
                }
            }
        }

    }

}