package edu.quarter_two.Lesson2;

public class Main {

    public static void main(String[] args) {
        Matrix("10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0", 4, 4);
    }

    public static void Matrix(String string, int SizeX, int SizeY) {

        String strResult = string.replaceAll("\n", " ");
        String[] array1 = strResult.split(" ");

        String[][] myStringArray = new String[SizeX][SizeY];

        for (int i = 0; i < array1.length; i++) {
            float rowFloat = i / SizeX;
            int a = (int) rowFloat;
            int b = i - (SizeX * a);
            myStringArray[a][b] = array1[i];
        }

        int[][] myIntArray = new int[SizeX][SizeY];

        for (int i = 0; i < myIntArray.length; i++) {
            for (int j = 0; j < myIntArray[i].length; j++) {
                    try
                {
                    myIntArray[i][j] = Integer.parseInt(myStringArray[i][j]);
                } catch (NumberFormatException a) {
                    System.out.println("Массив содержит нечисловой элемент или размер массива не равен условию - " + SizeX + "х" + SizeY);
                    break;
                }
            }
        }

        int sum = 0;
        int div = 2;
        for (int i = 0; i < myIntArray.length; i++) {
            for (int j = 0; j < myIntArray[i].length; j++) {
                sum = sum + myIntArray[i][j];
            }
        }
        int result = sum / div;

        System.out.println("Сумма всех элементов массива, деленная на " + div + ", равна " + result);
    }
}