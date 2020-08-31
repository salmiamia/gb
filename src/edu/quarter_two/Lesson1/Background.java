package edu.quarter_two.Lesson1;

import java.awt.*;
import java.util.Random;

public class Background {
    static void setBackground(GameCanvas canvas) {
        Random rn = new Random();
        Color c = new Color(rn.nextInt(256), rn.nextInt(256), rn.nextInt(256));
        canvas.setBackground(c);
    }
}
