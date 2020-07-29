package com.naman.daily.userInterface.visibility;

import com.naman.daily.userInterface.frame.window.prompt.todoPrompt;

public class inTodoMode {

    public void visibilityDuringTodo(todoPrompt ui) {

        //TO-DO elements double check
        ui.getTextFieldTodoAppend().setVisible(true);
        ui.getAppendTaskButton().setVisible(true);
    }
}
