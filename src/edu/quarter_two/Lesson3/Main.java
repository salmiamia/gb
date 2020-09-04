package edu.quarter_two.Lesson3;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // 1.
        // Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        // Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        // Посчитать сколько раз встречается каждое слово.

        String[] arCities = new String[] {"Berlin","Amsterdam", "Prague", "Vienna","Paris", "Oslo", "Rome","Paris", "Brussels", "Berlin","Helsinki", "Copenhagen", "Madrid","Lisbon", "Bern", "Amsterdam","Athens", "Helsinki", "Vienna","Paris", "Budapest"};
        ArrayList listWords = new ArrayList<>(Arrays.asList(arCities));

        Set<String> uniq = new HashSet<>();

        Iterator<String> iter = listWords.iterator();
        while (iter.hasNext()) {
            String s = iter.next();
            uniq.add(s);
        }
        System.out.println("Список уникальных значений: " + uniq);

        HashMap<String, Integer> countWords = new HashMap<>();
        System.out.println("Сколько раз встречается каждое слово:");
        for (String word : arCities) {
            if (!countWords.containsKey(word)) {
                countWords.put(word, 0);
            }
            countWords.put(word, countWords.get(word) + 1);
        }
        for (String word : countWords.keySet()) {
            System.out.println(word + " " + countWords.get(word));
        }

        Phonebook.addDefault();
        Phonebook.add("Ястребов 713456786");
        Phonebook.listAll();
        Phonebook.get("Воронов");
        Phonebook.get("Ястребов");
        Phonebook.get("Соколова");

    }
}