package com.naman.daily.userInterface.visibility;

import com.naman.daily.userInterface.dailyReportDesign;
import com.naman.daily.userInterface.frame.windowInterface;
import com.naman.daily.userInterface.fonts.sansProFont;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class onRefresh {
    public void visibilityOnRefresh(windowInterface ui, sansProFont font) {
        ui.getTextAreaMain().setText(null);
        ui.getTextAreaMain().append("\n" + "\n" + "\n" + "\n" + ui.getAppName().getText());
        ui.getTextAreaMain().setFont(font.getFontTitle());
    }

}
