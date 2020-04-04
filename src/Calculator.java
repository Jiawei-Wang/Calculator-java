import javax.swing.*;
import java.awt.*;

public class Calculator {
    // Part 1: UI
    // frame using JFrame
    JFrame frame = new JFrame("Calculator");
    frame.setLocation(300, 200);
    frame.setResizable(false);  // fixed size

    // result display using JTextField
    JTextField result_TextField = new JTextField(result, 20);

    // buttons using JButton
    JButton clear_Button = new JButton("Clear");  // clear input

    JButton button0 = new JButton("0");  // number buttons
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");

    JButton button_Dot = new JButton(".");  // operation buttons
    JButton button_Add = new JButton("+");
    JButton button_Minus = new JButton("-");
    JButton button_Multiply = new JButton("*");
    JButton button_Division = new JButton("/");
    JButton button_Equal = new JButton("=");

    // Panel using JPanel
    // Panel 1: all buttons except clear and display
    JPanel pan = new JPanel();
    pan.setLayout(new GridLayout(4, 4, 5, 5));  // 4 rows 4 columns 5 width 5 height
    pan.add(button7);
    pan.add(button8);
    pan.add(button9);
    pan.add(button_Division);
    pan.add(button4);
    pan.add(button5);
    pan.add(button6);
    pan.add(button_Multiply);
    pan.add(button1);
    pan.add(button2);
    pan.add(button3);
    pan.add(button_Minus);
    pan.add(button0);
    pan.add(button_Dot);
    pan.add(button_Equal);
    pan.add(button_Add);

    pan.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));  // set panel size

    // Panel 2: clear and display
    JPanel pan2 = new JPanel();
    pan2.setLayout(new BorderLayout());
    pan2.add(result_TextField, BorderLayout.WEST);
    pan2.add(clear_Button, BorderLayout.EAST);

    // put panels into frame
    frame.getContentPane().setLayout(new BorderLayout());
    frame.getContentPane().add(pan2, BorderLayout.NORTH);
    frame.getContentPane().add(pan, BorderLayout.CENTER);

    frame.pack();
    frame.setVisible(true);

    // Part 2: Logic
    

}
