package edu.quarter_one.Lesson5.task2;

public abstract class Animal {
    protected String type;
    protected String name;
    protected int maxRunDistance;
    protected double maxJumpDistance;
    protected int maxSwimDistance;

    public Animal(String type, String name, int maxRunDistance, double maxJumpDistance, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpDistance = maxJumpDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    public void run() {
        System.out.println(this.type + " " + this.name + " runs " + Main.taskToRun + " metres.");
    }

    public void jump() {
            System.out.println(this.type + " " + this.name + " jumps "  + Main.taskToJump + " metres.");
    }

    public void swim() {
            System.out.println(this.type + " " + this.name + " swims "  + Main.taskToSwim + " metres.");
    }
}