package com.naman.daily.actions.button;

import com.naman.daily.attributes.Time;
import com.naman.daily.user_interface.DailyReportDesign;
import com.naman.daily.user_interface.visibility.AFTER_TIME;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class timeButtonListener {

    public void listenTimeButton(DailyReportDesign ui) {

        ui.getTimeButton().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                //Attribute Element - Time and Welcome Message
                Time time = new Time();
                time.getWelcome(ui);

                //Optimize what can be seen for after time
                AFTER_TIME afterTimeVisibility = new AFTER_TIME();
                afterTimeVisibility.visibilityAfterTime(ui);
            }

        });

    }
}
