package edu.quarter_two.Lesson5;

public class Action {
    public static void Formula(float[] array, int size)
    {
        Thread thread = new Thread() {
            public void run() {
                for (int i = 0; i < size; i++) {
                    array[i] = (float)(array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        };
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}