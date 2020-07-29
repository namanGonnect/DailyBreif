package com.naman.daily.userInterface.colors;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class darkModeSetter {

    public void setColorButton(JButton button) {
        button.setBackground(Color.WHITE);
        button.setForeground(Color.BLACK);
    }

    public void setColorTextPainTodo(JTextArea pain) {
        pain.setBackground(Color.GRAY);
        pain.setForeground(Color.WHITE);
    }

    public void setColorTextArea(JTextArea pain) {
        pain.setBackground(Color.DARK_GRAY);
        pain.setForeground(Color.WHITE);
    }

    public void setColorTextField(JTextField field) {
        field.setBackground(Color.WHITE);
        field.setForeground(Color.BLACK);
    }

    public void setColorLabel(JLabel label) {
        label.setBackground(Color.DARK_GRAY);
        label.setForeground(Color.WHITE);
    }

    public void setColorMenuBar(JMenuBar bar) {
        bar.setBackground(Color.DARK_GRAY);
        bar.setForeground(Color.DARK_GRAY);
    }

    public void setColorFrame(JFrame frame) {
        frame.setBackground(Color.DARK_GRAY);
        frame.setForeground(Color.WHITE);
    }
}
