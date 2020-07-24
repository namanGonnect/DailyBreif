package com.naman.daily.actions.button.todo.process;

import com.naman.daily.user_interface.DailyReportDesign;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Calendar;
import java.util.Scanner;

public class showTodoButtonListener {
    public void listenShowTodoButton(DailyReportDesign ui) {
        ui.getShowTodoButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    ui.getTextPain().setText(null);

                    File file = new File("/Users/shimalo/IdeaProjects/DailyBreifV2/src/com/naman/daily/attributes/todo/file/TODO_FILE");

                    Scanner scanner = new Scanner(file);

                    while(scanner.hasNextLine()) {
                        ui.getTextPain().append("\n" + scanner.nextLine());
                    }

                } catch (IOException a) {
                    a.printStackTrace();
                }
            }
        });
    }
}
