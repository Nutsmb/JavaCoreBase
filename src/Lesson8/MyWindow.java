package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public float someNumber = 0;
    private static String str;

    public static JButton divButton = new JButton("/");
    public static JButton mulButton = new JButton("*");
    public static JButton subButton = new JButton("-");
    public static JButton addButton = new JButton("+");
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

        constraints.gridy = 0;

        constraints.gridx = 3;
        container.add(divButton, constraints);

        // set 1-9 number buttons
        int n = 0;
        for (int i = 2; i >=0; i--){
            for(int j = 0; j < 3; j++){
                n++;
                constraints.gridy = i;
                constraints.gridx = j;
                container.add(numberButtons[n], constraints);
            }
        }

        constraints.gridy = 1;
        constraints.gridx = 3;
        container.add(mulButton, constraints);

        constraints.gridy = 2;
        constraints.gridx = 3;
        container.add(subButton, constraints);

        constraints.gridy = 3;

        constraints.gridx = 3;
        container.add(addButton, constraints);
        constraints.gridx = 2;
        container.add(resultButton, constraints);
        constraints.gridx = 1;
        container.add(dotButton, constraints);
        constraints.gridx = 0;
        container.add(numberButtons[0], constraints);

        constraints.gridy = 4;

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
    }
}
