package com.naman.daily.control;

import com.naman.daily.attributes.todo.Todo;
import com.naman.daily.actions.button.timeButtonListener;
import com.naman.daily.actions.button.objectiveButtonListener;
import com.naman.daily.actions.button.timetableButtonListener;
import com.naman.daily.userInterface.colors.*;
import com.naman.daily.userInterface.visibility.onStart;
import com.naman.daily.actions.button.refreshButtonListener;
import com.naman.daily.userInterface.frame.windowInterface;
import com.naman.daily.userInterface.fonts.sansProFont;
import com.naman.daily.actions.button.todo.activate.showTodoButtonListener;
import com.naman.daily.userInterface.frame.window.prompt.todoPrompt;

public class Brief {

    public static void main(String[] args) {

        // Font Controller
        sansProFont sansProFont = new sansProFont();

        //User Interface Controller
        windowInterface ui = new windowInterface();
        ui.setMainFrame("Daily Brief", sansProFont.getFontTitle(), ui);

        //T O D O Window Controller
        todoPrompt todoPrompt = new todoPrompt();

        //Color Control
        darkModeSetter darkEnabler = new darkModeSetter();

        //Refresh Button Capabilities
        refreshButtonListener refreshButtonListener = new refreshButtonListener();
        refreshButtonListener.listenRefreshButton(ui, sansProFont);

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

        //Show T O D O interface listener
        showTodoButtonListener showTodoButtonListener = new showTodoButtonListener();
        showTodoButtonListener.listenObjectiveButton(ui, todoPrompt, sansProFont);
    }
}
