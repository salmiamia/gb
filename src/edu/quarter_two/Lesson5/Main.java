package edu.quarter_two.Lesson5;

public class Main {

    static final int size = 10000000;
    static final int h = size / 2;

    public static void arCreatedA() {

        float[] arr = new float[size]; // Объявление и выделение памяти для массива

        // Заполняем массив единицами
        for (int i = 0; i < size; i++) {
            arr[i] = (float)1.0;
        }

        long startTime = System.currentTimeMillis(); // Начало выполнения
        // Применение формулы
        for (int i = 0; i < size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        float deltaTime = (System.currentTimeMillis() - startTime); // Сколько выполнялся
        System.out.println(deltaTime + " millisec");
    }

    public static void arCreatedB() {

        float[] arr = new float[size]; // Объявление и выделение помяти для массива
        float[] a1 = new float[h]; // Объявление и выделение помяти для массива
        float[] a2 = new float[h]; // Объявление и выделение помяти для массива

        // Заполняем массив единицами
        for (int i = 0; i < size; i++) {
            arr[i] = (float)1.0;
        }

        long startTime = System.currentTimeMillis(); // Начало выполнения

        // Разбиваем массив
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        // Применение формулы, используя потоки
        Action.Formula(a1, h);
        Action.Formula(a2, h);

        // Склеиваем массив
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        float deltaTime = (System.currentTimeMillis() - startTime); // Сколько выполнялся
        System.out.println(deltaTime + " millisec");
    }

    public static void main(String[] args) {
        arCreatedA();
        arCreatedB();
    }

}