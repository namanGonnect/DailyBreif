package com.naman.daily.attributes.todo;
import com.naman.daily.actions.button.todo.process.*;
import com.naman.daily.userInterface.frame.window.prompt.todoPrompt;

import com.naman.daily.userInterface.frame.windowInterface;
import com.naman.daily.userInterface.fonts.sansProFont;
import com.naman.daily.actions.button.todo.activate.font.*;

public class Todo {
    public void getTodoCapability(todoPrompt ui, sansProFont sansProFont, windowInterface windowInterface) {

        //Make very Visible

        //Simple Append Button
        appendTodoButtonListener appendTodoButtonListener = new appendTodoButtonListener();
        appendTodoButtonListener.listenAppendTodoButton(ui);

        //Delete Button
        deleteTodoButtonListener deleteTodoButtonListener = new deleteTodoButtonListener();
        deleteTodoButtonListener.listenDeleteTodoButton(ui);

        //Show Button
        showTodoButtonListener showTodoButtonListener = new showTodoButtonListener();
        showTodoButtonListener.listenShowTodoButton(ui, sansProFont, windowInterface);

        //Clear Button
        clearTodoButtonListener clearTodoButtonListener = new clearTodoButtonListener();
        clearTodoButtonListener.listenClearTodoButton(ui);

        //Listen for Fonts
        makeFontIntelij makeFontIntelij = new makeFontIntelij();
        makeFontIntelij.makeFontIntelijItem(ui);

        makeFontPro makeFontPro = new makeFontPro();
        makeFontPro.makeFontSfProItem(ui);

        makeFontTrade makeFontTrade = new makeFontTrade();
        makeFontTrade.makeFontTradeItem(ui);
    }
}
