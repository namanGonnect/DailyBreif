package com.naman.daily.userInterface.visibility;

import com.naman.daily.userInterface.dailyReportDesign;

public class afterTimetable {
    public void visibilityAfterTimetable(dailyReportDesign ui) {

        //Button Preferences
        ui.getTimeButton().setVisible(false);
        ui.getObjectiveButton().setVisible(false);
        ui.getTimetableButton().setVisible(false);

        //Enable t o d o
        ui.getTodoAppendButton().setVisible(true);
        ui.getCommBox().setVisible(true);
        ui.getCommBoxLabel().setVisible(true);
        ui.getShowTodoButton().setVisible(true);
        ui.getDeleteTodoButton().setVisible(true);
        ui.getTodoAppendButton().setText("Add to List");
        ui.getCommBoxLabel().setText("Add Items");
        ui.getCommBox().setText("Type Here");
        ui.getDeleteTodoButton().setText("Delete List");
        ui.getShowTodoButton().setText("Show List");
    }
}
