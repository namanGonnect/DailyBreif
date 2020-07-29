package com.naman.daily.actions.button;

import com.naman.daily.userInterface.dailyReportDesign;
import com.naman.daily.userInterface.visibility.onRefresh;
import com.naman.daily.userInterface.frame.windowInterface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.naman.daily.userInterface.fonts.sansProFont;

public class refreshButtonListener {

    public void listenRefreshButton(windowInterface ui, sansProFont font) {

        ui.getRefreshManWindowItem().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                Toolkit.getDefaultToolkit().beep();

                onRefresh visibilityOnRefresh = new onRefresh();
                visibilityOnRefresh.visibilityOnRefresh(ui, font);
            }

        });

    }
}
