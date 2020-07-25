package com.naman.daily.attributes.todo;
import com.naman.daily.actions.button.todo.process.*;
import com.naman.daily.userInterface.dailyReportDesign;

public class Todo {
    public void getTodoCapability(dailyReportDesign ui) {

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
