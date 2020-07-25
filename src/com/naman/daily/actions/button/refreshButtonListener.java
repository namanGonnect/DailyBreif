package com.naman.daily.actions.button;

import com.naman.daily.userInterface.dailyReportDesign;
import com.naman.daily.userInterface.visibility.onRefresh;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class refreshButtonListener {

    public void listenRefreshButton(dailyReportDesign ui) {

        ui.getRefreshButton().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                onRefresh visibilityOnRefresh = new onRefresh();
                visibilityOnRefresh.visibilityOnRefresh(ui);
            }

        });

    }
}
