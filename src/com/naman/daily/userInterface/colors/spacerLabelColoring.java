package com.naman.daily.userInterface.colors;

import com.naman.daily.userInterface.dailyReportDesign;

import java.awt.*;

public class spacerLabelColoring {
    public void makeSpacersInvisible(dailyReportDesign ui) {

        //Change the text color
        ui.getSpaceLabelLeft().setForeground(Color.DARK_GRAY);
        ui.getSpaceLabelRight().setForeground(Color.DARK_GRAY);

        //Change the background to double ensure
        ui.getSpaceLabelLeft().setBackground(Color.DARK_GRAY);
        ui.getSpaceLabelRight().setBackground(Color.DARK_GRAY);
    }
}
