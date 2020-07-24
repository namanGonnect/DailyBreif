package com.naman.daily.user_interface.visibility;

import com.naman.daily.user_interface.DailyReportDesign;

public class IN_TODO_MODE {

    public void visibilityDuringTodo(DailyReportDesign ui) {

        //TO-DO elements enable
        ui.getTodoAppendButton().setVisible(true);
        ui.getDeleteTodoButton().setVisible(true);
        ui.getShowTodoButton().setVisible(true);
    }
}
