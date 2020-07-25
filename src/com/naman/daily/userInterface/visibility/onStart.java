package com.naman.daily.userInterface.visibility;

import com.naman.daily.userInterface.dailyReportDesign;

public class onStart {
    public void visibilityOnStart(dailyReportDesign ui){

        //Next Process Objects and writing enabled
        //Time object button
        ui.getTimeButton().setText("Get Report");
        ui.getTimeButton().setVisible(true);

        //Refresh Button
        ui.getRefreshButton().setVisible(true);
        ui.getRefreshButton().setText("Refresh");

        //Visibility for unused objects disabled
        ui.getObjectiveButton().setVisible(false);
        ui.getTimetableButton().setVisible(false);
        ui.getDeleteTodoButton().setVisible(false);
        ui.getTodoAppendButton().setVisible(false);
        ui.getCommBox().setVisible(false);
        ui.getCommBoxLabel().setVisible(false);
        ui.getShowTodoButton().setVisible(false);

        //In-refresh action mode
        ui.getTextPain().setText(" ");
    }
}
