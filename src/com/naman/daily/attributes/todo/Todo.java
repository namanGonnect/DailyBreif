package com.naman.daily.attributes.todo;
import com.naman.daily.actions.button.todo.process.*;
import com.naman.daily.user_interface.DailyReportDesign;

public class Todo {
    public void getTodoCapability(DailyReportDesign ui) {

        //Simple Append Button
        appendTodoButtonListener appendTodoButtonListener = new appendTodoButtonListener();
        appendTodoButtonListener.listenAppendTodoButton(ui);

        //Delete Button
        deleteTodoButtonListener deleteTodoButtonListener = new deleteTodoButtonListener();
        deleteTodoButtonListener.listenDeleteTodoButton(ui);

        //Show Button
        showTodoButtonListener showTodoButtonListener = new showTodoButtonListener();
        showTodoButtonListener.listenShowTodoButton(ui);
    }
}
