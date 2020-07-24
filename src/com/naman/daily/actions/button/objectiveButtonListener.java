package com.naman.daily.actions.button;

import com.naman.daily.attributes.Objective;
import com.naman.daily.user_interface.DailyReportDesign;
import com.naman.daily.user_interface.visibility.AFTER_OBJECTIVE;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class objectiveButtonListener {

    public void listenObjectiveButton(DailyReportDesign ui) {
        ui.getObjectiveButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Objective objective = new Objective();
                objective.getObjectiveMessage(ui);

                //Button Visibility after Objective
                AFTER_OBJECTIVE afterObjectiveVisibility = new AFTER_OBJECTIVE();
                afterObjectiveVisibility.visibilityAfterObjective(ui);
            }
        });
    }
}
