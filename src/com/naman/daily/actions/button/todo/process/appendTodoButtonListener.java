package com.naman.daily.actions.button.todo.process;

import com.naman.daily.userInterface.dailyReportDesign;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class appendTodoButtonListener {

    public void listenAppendTodoButton(dailyReportDesign ui) {
        ui.getTodoAppendButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    File file = new File("/Users/shimalo/IdeaProjects/DailyBreifV2/src/com/naman/daily/attributes/todo/file/TODO_FILE");

                    BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/shimalo/IdeaProjects/DailyBreifV2/src/com/naman/daily/attributes/todo/file/TODO_FILE", true));

                    writer.write("\n" + "-> " + ui.getCommBox().getText());
                    writer.flush();
                    writer.close();

                    ui.getCommBox().setText(null);
                } catch (IOException a) {
                    a.printStackTrace();
                }
            }
        });
    }
}
