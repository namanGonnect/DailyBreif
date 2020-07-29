package com.naman.daily.userInterface.visibility;

import com.naman.daily.userInterface.dailyReportDesign;
import com.naman.daily.userInterface.frame.windowInterface;

public class afterTime {
    public void visibilityAfterTime(windowInterface ui) {

        //Button Preferences
        ui.getShowObjectiveItem().setText("Get Objective");
        ui.getAppName().setVisible(false);
    }
}
