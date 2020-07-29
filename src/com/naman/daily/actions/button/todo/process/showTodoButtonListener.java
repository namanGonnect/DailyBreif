package com.naman.daily.actions.button.todo.process;

import com.naman.daily.userInterface.frame.window.prompt.todoPrompt;
import com.naman.daily.userInterface.visibility.onRefresh;
import com.naman.daily.userInterface.frame.windowInterface;
import com.naman.daily.userInterface.fonts.sansProFont;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class showTodoButtonListener {
    public void listenShowTodoButton(todoPrompt ui, sansProFont sansProFont, windowInterface windowInterface) {
        ui.getShowListItem().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    onRefresh onRefresh = new onRefresh();
                    onRefresh.visibilityOnRefresh(windowInterface, sansProFont);

                    ui.getTextAreaTodo().setText(null);

                    File file = new File("/Users/shimalo/IdeaProjects/DailyBreifV2/src/com/naman/daily/attributes/todo/file/TODO_FILE");

                    Scanner scanner = new Scanner(file);

                    while(scanner.hasNextLine()) {
                        ui.getTextAreaTodo().append("\n" + scanner.nextLine());
                    }

                } catch (IOException a) {
                    a.printStackTrace();
                }
            }
        });
    }
}
