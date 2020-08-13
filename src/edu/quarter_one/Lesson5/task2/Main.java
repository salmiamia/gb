package edu.quarter_one.Lesson5.task2;

// Создать классы Собака и Кот с наследованием от класса Животное.
// Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
// В качестве параметра каждому методу передается величина, означающая или длину препятствия
// (для бега и плавания), или высоту (для прыжков).
// При попытке животного выполнить одно из этих действий, оно должно сообщить результат
// (Например, dog1.run(150); -> результат: 'Пёсик пробежал!')

// * Добавить животным разброс в ограничениях.
// То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.

public class Main {

    static int taskToRun = 150;
    static double taskToJump = 0.5;
    static int taskToSwim = 25;

    public static void main(String[] args) {
        Dog dog1 = new Dog("Dog", "Rex", 600, 0.2, 20);
        Dog dog2 = new Dog("Dog","Bruno", 800, 0.8, 50);
        Cat cat1 = new Cat("Cat", "Pushok", 100, 3.0, 0);
        Cat cat2 = new Cat("Cat","Felix", 300, 2.0, 1);

        Animal[] pets = {dog1, dog2, cat1, cat2};
        for (int i = 0; i < pets.length; i++) {
            if (taskToRun <= pets[i].maxRunDistance) {
                pets[i].run();
            }
            if (taskToJump <= pets[i].maxJumpDistance) {
                pets[i].jump();
            }
            if (taskToSwim <= pets[i].maxSwimDistance) {
                pets[i].swim();
            }
            System.out.println("");
        }
    }
}