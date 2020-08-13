package edu.quarter_one.Lesson5.task1;

public class Dog extends Animal {

    public static int swimMaxDistance = 10;
    public static int runMaxDistance = 500;
    public static double jumpMaxHeight = 0.5;

    public Dog(String type, String name) {
        super(type, name);
    }

    @Override
    public void run(int taskToRun) {
        if (taskToRun <= runMaxDistance) {
            System.out.println(this.type + " " + this.name + " runs " + Main.taskToRun + " metres.");
        }
    }

    @Override
    public void jump(double taskToJump) {
        if (taskToJump <= jumpMaxHeight) {
            System.out.println(this.type + " " + this.name + " jumps " + Main.taskToJump + " metres.");
        }
    }

    public final void swim(int taskToSwim) {
        if (taskToSwim <= swimMaxDistance) {
            System.out.println(this.type + " " + this.name + " swims " + Main.taskToSwim + " metres.");
        }
    }
}