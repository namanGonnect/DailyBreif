package com.naman.daily.userInterface.visibility;

import com.naman.daily.userInterface.dailyReportDesign;

public class inTodoMode {

    public void visibilityDuringTodo(dailyReportDesign ui) {

        //TO-DO elements enable
        ui.getTodoAppendButton().setVisible(true);
        ui.getDeleteTodoButton().setVisible(true);
        ui.getShowTodoButton().setVisible(true);
    }
}
