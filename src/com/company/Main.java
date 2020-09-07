package com.company;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Main {
Robot robot=new Robot();

    public Main() throws AWTException {
    }

    public static void main(String[] args) {
	// write your code here

        try {
            Robot robot=new Robot();
            robot.delay(400);
            for (int i = 0; i < 4; i++) {

                robot.keyPress(KeyEvent.VK_K);
                robot.keyPress(KeyEvent.VK_O);
                robot.keyPress(KeyEvent.VK_C);
                robot.keyPress(KeyEvent.VK_H);
                robot.keyPress(KeyEvent.VK_A);
                robot.keyPress(KeyEvent.VK_M);
                robot.keyPress(KeyEvent.VK_SPACE);
                robot.keyPress(KeyEvent.VK_C);
                robot.keyPress(KeyEvent.VK_I);
                robot.keyPress(KeyEvent.VK_E);

                robot.keyPress(KeyEvent.VK_SPACE);
                robot.keyPress(KeyEvent.VK_ENTER);
            }
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    private void leftClick() {
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(200);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(200);
    }
    private void type(int i) {
        robot.delay(500);
        robot.keyPress(i);
        robot.keyRelease(i);
    }
    private void type(String s) {
        byte[] bytes = s.getBytes();
        for (byte b : bytes) {
            int code = b;
            // keycode only handles [A-Z] (which is ASCII decimal [65-90])
            if (code > 96 && code < 123) code = code - 32;
            robot.delay(10);
            robot.keyPress(code);
            robot.keyRelease(code);
        }
    }
}
