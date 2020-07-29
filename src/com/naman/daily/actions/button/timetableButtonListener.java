package com.naman.daily.actions.button;

import com.naman.daily.attributes.subjects.Timetable;
import com.naman.daily.userInterface.dailyReportDesign;
import com.naman.daily.userInterface.visibility.afterTimetable;
import com.naman.daily.userInterface.frame.windowInterface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class timetableButtonListener {

    public void listenTimetableButton(windowInterface ui){

        ui.getShowTimetableItem().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                Toolkit.getDefaultToolkit().beep();

                //Timetable process
                Timetable timetable = new Timetable();
                timetable.getTimeTable(ui);

                //T O D O Start
                afterTimetable visibilityAfterTimetable = new afterTimetable();
                visibilityAfterTimetable.visibilityAfterTimetable(ui);
            }

        });
    }

}
