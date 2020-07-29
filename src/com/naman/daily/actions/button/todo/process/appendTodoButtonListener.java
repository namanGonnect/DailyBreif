package com.naman.daily.actions.button.todo.process;

import com.naman.daily.userInterface.frame.window.prompt.todoPrompt;
import com.naman.daily.userInterface.frame.windowInterface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class appendTodoButtonListener {

    public void listenAppendTodoButton(todoPrompt ui) {
        ui.getAppendTaskButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    Toolkit.getDefaultToolkit().beep();

                    File file = new File("/Users/shimalo/IdeaProjects/DailyBreifV2/src/com/naman/daily/attributes/todo/file/TODO_FILE");

                    BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/shimalo/IdeaProjects/DailyBreifV2/src/com/naman/daily/attributes/todo/file/TODO_FILE", true));

                    writer.write("\n" + "-> " + ui.getTextFieldTodoAppend().getText());
                    writer.flush();
                    writer.close();

                    ui.getTextAreaTodo().append("\n" + "-> " + ui.getTextFieldTodoAppend().getText());

                    ui.getTextFieldTodoAppend().setText(null);
                } catch (IOException a) {
                    a.printStackTrace();
                }
            }
        });
    }
}
