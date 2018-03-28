package com.myPersonalCalculator;

import javax.swing.*;

public class CalculatorRunner {

    public static void main(String[] args) {

        String a = JOptionPane.showInputDialog("Enter 'A' number ");
        String mathAction = JOptionPane.showInputDialog("Enter math action from + - * /");
        String b = JOptionPane.showInputDialog("Enter 'B' number ");

        Double d = Double.parseDouble(a);
        Double e = Double.parseDouble(b);


        if (mathAction.equals("+")) {
            JOptionPane.showMessageDialog(null, "The result of the addition is: " + (d + e));
        } else if (mathAction.equals("-")) {
            JOptionPane.showMessageDialog(null, "The subtraction result is: " + (d - e));
        } else if (mathAction.equals("*")) {
            JOptionPane.showMessageDialog(null, "The equals result is: " + (d * e));
        } else if (mathAction.equals("/")) {
            JOptionPane.showMessageDialog(null, "The result of divide is: " + (d / e));
        } else
            JOptionPane.showMessageDialog(null, "Incorrect math action");
    }
}

