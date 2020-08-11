package edu.quarter_one.Lesson5.task1;

public class Cat extends Animal {

    int runMaxDistance = 200;
    double jumpMaxHeight = 2.0;

    public Cat (String type, String name) {
        super (type, name);
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


}
