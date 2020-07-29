package com.naman.daily.actions.button;

import com.naman.daily.attributes.Objective;
import com.naman.daily.userInterface.dailyReportDesign;
import com.naman.daily.userInterface.visibility.afterObjective;
import com.naman.daily.userInterface.frame.windowInterface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class objectiveButtonListener {

    public void listenObjectiveButton(windowInterface ui) {
        ui.getShowObjectiveItem().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Toolkit.getDefaultToolkit().beep();

                Objective objective = new Objective();
                objective.getObjectiveMessage(ui);

                //Button Visibility after Objective
                afterObjective afterObjectiveVisibility = new afterObjective();
                afterObjectiveVisibility.visibilityAfterObjective(ui);
            }
        });
    }
}
