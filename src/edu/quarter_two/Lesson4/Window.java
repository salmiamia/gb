package edu.quarter_two.Lesson4;


import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;

public class Window extends JFrame {

    public Window() {
        setTitle("Пишем в файл из этого окна по нажатию кнопки Отправить или клавиши Enter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // По нажатию на крестик - закрытие программы

        // Определяем размер окна и выводим его на экран
        setBounds(200, 200, 660, 80);

        // Создание кнопки
        JButton button = new JButton("Отправить");

        // Создание поля для ввода
        JTextField field = new JTextField(45);

        // Слушатель по Enter
        field.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Отображение введенного текста в консоли
                System.out.println(field.getText());
                // Пишем в файл
                Action.textWrite(Action.logFileName, field.getText());
                // Очищаем поле ввода
                field.setText("");
            }
        });

        // Слушаетль по кнопке
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Отображение введенного текста в консоли
                System.out.println(field.getText());
                // Пишем в файл
                Action.textWrite(Action.logFileName, field.getText());
                // Очищаем поле ввода
                field.setText("");
            }
        });

        // Создание панели с полем для ввода
        JPanel contents = new JPanel(new FlowLayout(FlowLayout.LEFT));
        contents.add(field); // поле ввода
        contents.add(button); // кнопка
        setContentPane(contents);

        // Показываем окно
        setVisible(true);
    }

}