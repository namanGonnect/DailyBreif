package com.naman.daily.user_interface.visibility;

import com.naman.daily.user_interface.DailyReportDesign;

public class ON_START {
    public void visibilityOnStart(DailyReportDesign ui){

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
