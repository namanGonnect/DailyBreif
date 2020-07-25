package com.naman.daily.userInterface.visibility;

import com.naman.daily.userInterface.dailyReportDesign;

public class afterObjective {
    public void visibilityAfterObjective(dailyReportDesign ui) {

        //Button Preferences
        ui.getTimetableButton().setText("Get Time-Table");
        ui.getTimeButton().setVisible(false);
        ui.getObjectiveButton().setVisible(false);
        ui.getTimetableButton().setVisible(true);

    }
}
