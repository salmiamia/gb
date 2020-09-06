package edu.quarter_two.Lesson3;

import java.util.ArrayList;

// 2.
// Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add() можно добавлять записи.
// С помощью метода get() искать номер телефона по фамилии.
// Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
// тогда при запросе такой фамилии должны выводиться все телефоны.

public class Phonebook {

    public static ArrayList<String> arListPhone = new ArrayList<>(); // одномерный массив, поиск будет идти по "строке"

    // Создаем список по умолчанию фамилий и номеров для поиска и вывода
    public static void addDefault () {
        arListPhone.add("Кукушкин 113456781");
        arListPhone.add("Соколова 123456781");
        arListPhone.add("Орлов 213456782");
        arListPhone.add("Воробьева 223456782");
        arListPhone.add("Соколова 323456783");
        arListPhone.add("Синицын 423456784");
        arListPhone.add("Голубев 513456785");
        arListPhone.add("Голубева 523456785");
        arListPhone.add("Кукушкин 623456786");
    }

    // Добаваление новой записи в телефонный справочник
    public static void add(String arListPhone) {
        Phonebook.arListPhone.add(arListPhone);
    }

    // Печать всего телефонного справочника
    public static void listAll() {
        System.out.println("Телефонный справочник:");
        for(int i = 0; i < arListPhone.size(); i++) {
            System.out.println(arListPhone.get(i));
        }
    }

    // Поиск по телефонному справочнику
    public static void get(String surname) {
        boolean res = false;
        System.out.println("Поиск номера телефона по фамилии \"" + surname + "\": ");
        for(int i = 0; i < arListPhone.size(); i++) {
            if (arListPhone.get(i).lastIndexOf(surname) != -1) {
                System.out.println(arListPhone.get(i));
                res = true;
            }
        }
        if (!res) {
            System.out.println("- телефоны не найдены.");
        }
    }
}