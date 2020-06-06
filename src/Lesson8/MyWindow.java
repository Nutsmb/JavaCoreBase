package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public float someNumber = 0;
    String str;

    public MyWindow(){

        setSize(500, 500);
        setLocation(650, 250);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        creatUI(this.getContentPane());

        setVisible(true);
    }

    public static void creatUI(Container container){
        container.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        container.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0.5;

        constraints.gridy = 1;

        JButton divButton = new JButton("/");
        constraints.gridx = 3;
        container.add(divButton, constraints);

        JButton button9 = new JButton("9");
        constraints.gridx = 2;
        container.add(button9, constraints);

        JButton button8 = new JButton("8");
        constraints.gridx = 1;
        container.add(button8, constraints);

        JButton button7 = new JButton("7");
        constraints.gridx = 0;
        container.add(button7, constraints);

        constraints.gridy = 2;

        JButton mulButton = new JButton("*");
        constraints.gridx = 3;
        container.add(mulButton, constraints);

        JButton button6 = new JButton("6");
        constraints.gridx = 2;
        container.add(button6, constraints);

        JButton button5 = new JButton("5");
        constraints.gridx = 1;
        container.add(button5, constraints);

        JButton button4 = new JButton("4");
        constraints.gridx = 0;
        container.add(button4, constraints);

        constraints.gridy = 3;

        JButton subButton = new JButton("-");
        constraints.gridx = 3;
        container.add(subButton, constraints);

        JButton button3 = new JButton("3");
        constraints.gridx = 2;
        container.add(button3, constraints);

        JButton button2 = new JButton("2");
        constraints.gridx = 1;
        container.add(button2, constraints);

        JButton button1 = new JButton("1");
        constraints.gridx = 0;
        container.add(button1, constraints);

        constraints.gridy = 4;

        JButton addButton = new JButton("+");
        constraints.gridx = 3;
        container.add(addButton, constraints);

        JButton resultButton = new JButton("=");
        constraints.gridx = 2;
        container.add(resultButton, constraints);

        JButton dotButton = new JButton(".");
        constraints.gridx = 1;
        container.add(dotButton, constraints);

        JButton button0 = new JButton("0");
        constraints.gridx = 0;
        container.add(button0, constraints);

        JTextField inputLine = new JTextField();
        constraints.ipady = 45;
        constraints.gridwidth = 4;
        constraints.gridy = 5;
        constraints.gridx = 0;
        container.add(inputLine, constraints);
    }
}
