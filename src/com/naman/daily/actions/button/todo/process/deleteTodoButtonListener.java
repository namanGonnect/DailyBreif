package com.naman.daily.actions.button.todo.process;

import com.naman.daily.userInterface.dailyReportDesign;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class deleteTodoButtonListener {
    public void listenDeleteTodoButton(dailyReportDesign ui) {
        ui.getDeleteTodoButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    File file = new File("/Users/shimalo/IdeaProjects/DailyBreifV2/src/com/naman/daily/attributes/todo/file/TODO_FILE");

                    BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/shimalo/IdeaProjects/DailyBreifV2/src/com/naman/daily/attributes/todo/file/TODO_FILE", false));

                    writer.write("-> Deleted on " + getTime());
                    writer.flush();
                    writer.close();

                    ui.getCommBox().setText(null);
                } catch (IOException a) {
                    a.printStackTrace();
                }
            }
        });
    }
    private String getTime() {
        Calendar calendar = Calendar.getInstance();

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");

        String time = formatter.format(calendar.getTime());

        return time;
    }
}
