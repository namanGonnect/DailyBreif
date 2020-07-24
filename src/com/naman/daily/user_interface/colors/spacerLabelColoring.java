package com.naman.daily.user_interface.colors;

import com.naman.daily.user_interface.DailyReportDesign;

import java.awt.*;

public class spacerLabelColoring {
    public void makeSpacersInvisible(DailyReportDesign ui) {

        //Change the text color
        ui.getSpaceLabelLeft().setForeground(Color.DARK_GRAY);
        ui.getSpaceLabelRight().setForeground(Color.DARK_GRAY);

        //Change the background to double ensure
        ui.getSpaceLabelLeft().setBackground(Color.DARK_GRAY);
        ui.getSpaceLabelRight().setBackground(Color.DARK_GRAY);
    }
}
