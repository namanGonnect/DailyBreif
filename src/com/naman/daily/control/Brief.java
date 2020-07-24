package com.naman.daily.control;

import com.naman.daily.attributes.todo.Todo;
import com.naman.daily.user_interface.DailyReportDesign;
import com.naman.daily.actions.button.timeButtonListener;
import com.naman.daily.actions.button.objectiveButtonListener;
import com.naman.daily.actions.button.timetableButtonListener;
import com.naman.daily.user_interface.colors.*;
import com.naman.daily.user_interface.visibility.ON_START;
import com.naman.daily.actions.button.refreshButtonListener;


import java.awt.*;

public class Brief {

    public static void main(String[] args) {

        //User Interface Controller
        DailyReportDesign ui = new DailyReportDesign();
        ui.setWindow("Daily Brief");

        //Color Control
        darkModeSetter darkEnabler = new darkModeSetter();
        darkEnabler.setColorTextArea(ui.getTextPain());
        spacerLabelColoring spacerLabelColoring = new spacerLabelColoring();
        spacerLabelColoring.makeSpacersInvisible(ui);

        //Refresh Button Capabilities
        refreshButtonListener refreshButtonListener = new refreshButtonListener();
        refreshButtonListener.listenRefreshButton(ui);

        //Optimize what can be seen
        ON_START startVisibility = new ON_START();
        startVisibility.visibilityOnStart(ui);

        //Time Button Listener
        timeButtonListener timeButtonListener = new timeButtonListener();
        timeButtonListener.listenTimeButton(ui);

        //Objective Button Listener
        objectiveButtonListener objectiveButtonListener = new objectiveButtonListener();
        objectiveButtonListener.listenObjectiveButton(ui);

        //TimeTable Button Listener
        timetableButtonListener timetableButtonListener = new timetableButtonListener();
        timetableButtonListener.listenTimetableButton(ui);
        darkEnabler.setColorLabel(ui.getCommBoxLabel());

        //Enable TO-DO
        Todo todo = new Todo();
        todo.getTodoCapability(ui);

    }
}
