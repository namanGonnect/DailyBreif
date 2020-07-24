package com.naman.daily.user_interface;

import javax.swing.*;
import java.awt.*;

public class DailyReportDesign extends JFrame{

    private JPanel Window;
    private JTextArea textPain;
    private JLabel label1;
    private JButton timeButton;
    private JButton objectiveButton;
    private JButton timetableButton;
    private JLabel spaceLabelLeft;
    private JLabel spaceLabelRight;
    private JTextField CommBox;
    private JLabel CommBoxLabel;
    private JButton todoAppendButton;
    private JButton refreshButton;
    private JButton showTodoButton;
    private JButton deleteTodoButton;
    private JFrame frame = new JFrame();
    private JFileChooser fileChooser = new JFileChooser();

    public void setWindow(String appName) {

        getTimeButton().setVisible(true);
        getTimeButton().setText("Get Report");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700, 700);
        this.setContentPane(Window);
        this.pack();
        this.setVisible(true);

        this.getContentPane().setBackground(Color.darkGray);

        this.setSize(1100, 800);

    }

    //Get Window Attributes
    public JPanel getWindow() {
        return Window;
    }

    public JTextArea getTextPain() {
        return textPain;
    }

    public JLabel getLabel1() {
        return label1;
    }

    public JButton getTimeButton() {
        return timeButton;
    }

    public JButton getObjectiveButton() {
        return objectiveButton;
    }

    public JButton getTimetableButton() {
        return timetableButton;
    }

    public JLabel getSpaceLabelLeft() {
        return spaceLabelLeft;
    }

    public JLabel getSpaceLabelRight() {
        return spaceLabelRight;
    }

    public JTextField getCommBox() {
        return CommBox;
    }

    public JLabel getCommBoxLabel() {
        return CommBoxLabel;
    }

    public JButton getTodoAppendButton() {
        return todoAppendButton;
    }

    public JButton getRefreshButton() {
        return refreshButton;
    }

    public JButton getShowTodoButton() {
        return showTodoButton;
    }

    public JButton getDeleteTodoButton() {
        return deleteTodoButton;
    }

    public JFrame getFrame() {
        return frame;
    }

    public JFileChooser getFileChooser() {
        return fileChooser;
    }

}
