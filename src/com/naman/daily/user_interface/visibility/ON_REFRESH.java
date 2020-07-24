package com.naman.daily.user_interface.visibility;

import com.naman.daily.user_interface.DailyReportDesign;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ON_REFRESH {
    public void visibilityOnRefresh(DailyReportDesign ui) {
        ui.getRefreshButton().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ui.getTextPain().setText(null);
                ui.getTimeButton().setVisible(true);
                ui.getObjectiveButton().setVisible(false);
                ui.getTimetableButton().setVisible(false);
                ui.getTodoAppendButton().setVisible(false);
                ui.getCommBox().setVisible(false);
                ui.getCommBoxLabel().setVisible(false);
                ui.getDeleteTodoButton().setVisible(false);
                ui.getShowTodoButton().setVisible(false);
            }
        });
    }

}
