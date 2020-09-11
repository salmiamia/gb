package edu.quarter_two.Lesson4;

import java.io.FileOutputStream;
import java.io.IOException;

public class Action {

    public static final String logFileName = "log-file.txt";

    public static void textWrite(String logFileName, String text) {
        try {
            FileOutputStream fos = new FileOutputStream(logFileName, true); // Имя файла, в который пишем, true - дописываем
            String format_text = text + " \n"; // Перенос строки для нового текста
            fos.write(format_text.getBytes());
            fos.flush();
            fos.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

}