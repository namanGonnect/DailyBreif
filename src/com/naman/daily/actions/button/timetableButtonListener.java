package com.naman.daily.actions.button;

import com.naman.daily.attributes.Timetable;
import com.naman.daily.userInterface.dailyReportDesign;
import com.naman.daily.userInterface.visibility.afterTimetable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class timetableButtonListener {

    public void listenTimetableButton(dailyReportDesign ui){

        ui.getTimetableButton().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

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
