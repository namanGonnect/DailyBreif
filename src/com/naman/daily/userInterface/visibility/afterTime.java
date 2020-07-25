package com.naman.daily.userInterface.visibility;

import com.naman.daily.userInterface.dailyReportDesign;

public class afterTime {
    public void visibilityAfterTime(dailyReportDesign ui) {

        //Button Preferences
        ui.getObjectiveButton().setText("Get Objective");
        ui.getTimeButton().setVisible(false);
        ui.getObjectiveButton().setVisible(true);
        ui.getTimetableButton().setVisible(false);
    }
}
