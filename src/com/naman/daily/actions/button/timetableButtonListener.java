package com.naman.daily.actions.button;

import com.naman.daily.attributes.Timetable;
import com.naman.daily.user_interface.DailyReportDesign;
import com.naman.daily.user_interface.visibility.AFTER_TIMETABLE;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class timetableButtonListener {

    public void listenTimetableButton(DailyReportDesign ui){

        ui.getTimetableButton().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                //Timetable process
                Timetable timetable = new Timetable();
                timetable.getTimeTable(ui);

                //T O D O Start
                AFTER_TIMETABLE visibilityAfterTimetable = new AFTER_TIMETABLE();
                visibilityAfterTimetable.visibilityAfterTimetable(ui);
            }

        });
    }

}
