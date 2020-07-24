package com.naman.daily.texteditor.user_interface;

import javax.swing.*;
import com.naman.daily.texteditor.attributes.actions.fileSelector;

public class PaneFormation {

    private JFrame frame = new JFrame();

    public JEditorPane getEditorPane() {
        return editorPane;
    }

    private JEditorPane editorPane = new JEditorPane();
    private JMenuBar menuBar = new JMenuBar();
    private JMenuItem item = new JMenuItem();
    private JFileChooser fileChooser = new JFileChooser();
    private StringBuilder sb = new StringBuilder();
    fileSelector fileDirectory = new fileSelector();

    private JFrame MakePlane() {

        frame.setVisible(true);
        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(editorPane);

        return frame;
    }

    public JFrame getPlain() {
        return MakePlane();
    }
}
