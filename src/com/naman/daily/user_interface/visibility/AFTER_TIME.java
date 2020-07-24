package com.naman.daily.user_interface.visibility;

import com.naman.daily.user_interface.DailyReportDesign;

public class AFTER_TIME {
    public void visibilityAfterTime(DailyReportDesign ui) {

        //Button Preferences
        ui.getObjectiveButton().setText("Get Objective");
        ui.getTimeButton().setVisible(false);
        ui.getObjectiveButton().setVisible(true);
        ui.getTimetableButton().setVisible(false);
    }
}
