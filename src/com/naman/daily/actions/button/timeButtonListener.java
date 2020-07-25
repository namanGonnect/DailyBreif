package com.naman.daily.actions.button;

import com.naman.daily.attributes.Time;
import com.naman.daily.userInterface.dailyReportDesign;
import com.naman.daily.userInterface.visibility.afterTime;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class timeButtonListener {

    public void listenTimeButton(dailyReportDesign ui) {

        ui.getTimeButton().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                //Attribute Element - Time and Welcome Message
                Time time = new Time();
                time.getWelcome(ui);

                //Optimize what can be seen for after time
                afterTime afterTimeVisibility = new afterTime();
                afterTimeVisibility.visibilityAfterTime(ui);
            }

        });

    }
}
