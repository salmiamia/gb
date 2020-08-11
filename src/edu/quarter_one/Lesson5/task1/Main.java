package edu.quarter_one.Lesson5.task1;

// Создать классы Собака и Кот с наследованием от класса Животное.
// Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
// В качестве параметра каждому методу передается величина, означающая или длину препятствия
// (для бега и плавания), или высоту (для прыжков).
// У каждого животного есть ограничения на действия
// (бег: кот 200 м., собака 500 м; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м).
// При попытке животного выполнить одно из этих действий, оно должно сообщить результат
// (Например, dog1.run(150); -> результат: 'Пёсик пробежал!')

public class Main {

    static int taskToRun = 150;
    static double taskToJump = 1.0;
    static int taskToSwim = 8;

    public static void main(String[] args) {
        Dog dog1 = new Dog("Dog", "Bobik");
        Dog dog2 = new Dog("Dog","Barbos");
        Cat cat1 = new Cat("Cat","Tom");
        Cat cat2 = new Cat("Cat","Kompot");

        Animal[] pets = {dog1, dog2, cat1, cat2};
        for (int i = 0; i < pets.length; i++) {
            pets[i].run(taskToRun);
            pets[i].jump(taskToJump);
            if (pets[i] instanceof Dog) {
                ((Dog) pets[i]).swim(taskToSwim);
            }
            System.out.println("");
        }
    }
}