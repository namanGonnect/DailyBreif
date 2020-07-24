package com.naman.daily.user_interface.visibility;

import com.naman.daily.user_interface.DailyReportDesign;

public class AFTER_OBJECTIVE {
    public void visibilityAfterObjective(DailyReportDesign ui) {

        //Button Preferences
        ui.getTimetableButton().setText("Get Time-Table");
        ui.getTimeButton().setVisible(false);
        ui.getObjectiveButton().setVisible(false);
        ui.getTimetableButton().setVisible(true);

    }
}
