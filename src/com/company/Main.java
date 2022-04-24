package com.company;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Main {

    public static void main(String[] args) {

        // Наше окно
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(1024, 768);
        jFrame.setTitle("Мой проект");

        JPanel jPanel = new JPanel();

        JButton jButton1 = new JButton("Номер 1");
        JButton jButton2 = new JButton("Номер 2");

        jPanel.add(jButton1);
        jPanel.add(jButton2);

        jFrame.add(jPanel);

        // Отображаем окно
        jFrame.setVisible(true);


        // Добавляем обработчик
        jButton1.addActionListener(e -> {
            System.out.println("Нажата кнопка 1");

            try {
                File file = new File("home" + File.separator + "");
                Desktop.getDesktop().open(file);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        });

        jButton2.addActionListener(e -> {
            System.out.println("Нажата кнопка 2");
        });
    }
}
