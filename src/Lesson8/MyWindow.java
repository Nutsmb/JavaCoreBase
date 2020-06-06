package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public float someNumber = 0;
    private static String str;

    public static JButton resultButton = new JButton("=");
    public static JButton dotButton = new JButton(".");
    public static JTextField inputLine = new JTextField();

    public static JButton[] numberButtons = {
            new JButton("0"),
            new JButton("1"),
            new JButton("2"),
            new JButton("3"),
            new JButton("4"),
            new JButton("5"),
            new JButton("6"),
            new JButton("7"),
            new JButton("8"),
            new JButton("9")
    };
    public static JButton[] operationButtons = {
        new JButton("/"),
        new JButton("*"),
        new JButton("-"),
        new JButton("+")
    };

    public MyWindow(){

        setSize(500, 500);
        setLocation(650, 250);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        creatUI(this.getContentPane());
        setButtonsListeners();

        setVisible(true);
    }

    public static void creatUI(Container container){
        container.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        container.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0.5;

        // set 1-9 number buttons
        int n = 0;
        for (int i = 3; i >0; i--){
            for(int j = 0; j < 3; j++){
                n++;
                constraints.gridy = i;
                constraints.gridx = j;
                container.add(numberButtons[n], constraints);
            }
        }

        int s = 0;
        for(int i =1; i < 5; i++){
            constraints.gridy = i;
            constraints.gridx = 3;
            container.add(operationButtons[s], constraints);
            s++;
        }

        constraints.gridy = 4;

        constraints.gridx = 2;
        container.add(resultButton, constraints);
        constraints.gridx = 1;
        container.add(dotButton, constraints);
        constraints.gridx = 0;
        container.add(numberButtons[0], constraints);

        constraints.gridy = 0;

        constraints.ipady = 45;
        constraints.gridwidth = 4;
        constraints.gridx = 0;
        container.add(inputLine, constraints);
    }

    public static void setButtonsListeners(){
        for (JButton button: numberButtons) {
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    inputLine.setText(inputLine.getText() + button.getText());
                }
            });
        }
        for (JButton button: operationButtons) {
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    inputLine.setText(inputLine.getText() + button.getText());
                }
            });
        }
        dotButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                inputLine.setText(inputLine.getText() + dotButton.getText());
            }
        });
        resultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parseExpression(inputLine.getText());
            }
        });
    }

    public static void parseExpression(String expression){
        
    }
}
