package edu.quarter_one.Lesson5.task1;

public abstract class Animal {
    protected String type;
    protected String name;


    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public abstract void run(int taskToRun);
    public abstract void jump(double taskToJump);
}