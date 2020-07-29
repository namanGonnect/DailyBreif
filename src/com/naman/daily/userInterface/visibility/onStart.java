package com.naman.daily.userInterface.visibility;

import com.naman.daily.userInterface.dailyReportDesign;
import com.naman.daily.userInterface.frame.windowInterface;

public class onStart {
    public void visibilityOnStart(windowInterface ui){

        //Next Process Objects and writing enabled
        //Time object button
        ui.getShowTimeItem().setText("Get Report");
        ui.getAppName().setVisible(true);



        //Visibility for unused objects disabled - invalid for V3 - Compatibility
//        ui.getObjectiveButton().setVisible(false);
//        ui.getTimetableButton().setVisible(false);
//        ui.getDeleteTodoButton().setVisible(false);
//        ui.getTodoAppendButton().setVisible(false);
//        ui.getCommBox().setVisible(false);
//        ui.getCommBoxLabel().setVisible(false);
//        ui.getShowTodoButton().setVisible(false);

    }
}
