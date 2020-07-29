package com.naman.daily.userInterface.visibility;

import com.naman.daily.userInterface.frame.windowInterface;

public class onStart {
    public void visibilityOnStart(windowInterface ui){

        //Next Process Objects and writing enabled
        //Time object button
        ui.getShowTimeItem().setText("Get Report");
        ui.getAppName().setVisible(true);

    }
}
