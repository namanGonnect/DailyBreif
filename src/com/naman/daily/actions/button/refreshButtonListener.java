package com.naman.daily.actions.button;

import com.naman.daily.user_interface.DailyReportDesign;
import com.naman.daily.user_interface.visibility.ON_REFRESH;
import com.naman.daily.user_interface.visibility.ON_START;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class refreshButtonListener {

    public void listenRefreshButton(DailyReportDesign ui) {

        ui.getRefreshButton().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                ON_REFRESH visibilityOnRefresh = new ON_REFRESH();
                visibilityOnRefresh.visibilityOnRefresh(ui);
            }

        });

    }
}
