package org.example;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main() {
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(500,500);
        add(new GameField());
        setSize(320,320);
        setVisible(true);
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}