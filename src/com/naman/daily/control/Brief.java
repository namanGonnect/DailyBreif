package com.naman.daily.control;

import com.naman.daily.attributes.todo.Todo;
import com.naman.daily.userInterface.dailyReportDesign;
import com.naman.daily.actions.button.timeButtonListener;
import com.naman.daily.actions.button.objectiveButtonListener;
import com.naman.daily.actions.button.timetableButtonListener;
import com.naman.daily.userInterface.colors.*;
import com.naman.daily.userInterface.visibility.onStart;
import com.naman.daily.actions.button.refreshButtonListener;

public class Brief {

    public static void main(String[] args) {

        //User Interface Controller
        dailyReportDesign ui = new dailyReportDesign();
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
        onStart startVisibility = new onStart();
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
