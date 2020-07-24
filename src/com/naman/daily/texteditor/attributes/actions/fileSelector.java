package com.naman.daily.texteditor.attributes.actions;

import com.naman.daily.user_interface.DailyReportDesign;

import javax.swing.*;
import java.util.Scanner;

public class fileSelector {
    String file = null;

    public String getFileDirectory(DailyReportDesign ui) {

        try {
            StringBuilder sb = new StringBuilder();

            if (ui.getFileChooser().showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {

                file = ui.getFileChooser().getSelectedFile().getName();
                Scanner input = new Scanner(file);

                while (input.hasNext()) {
                    sb.append(input.nextLine());
                    sb.append("\n");
                }
                input.close();
            } else {
                sb.append("No such file found.");
            }
            System.out.println(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return file;
    }
}

