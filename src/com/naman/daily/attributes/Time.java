package com.naman.daily.attributes;

import com.naman.daily.userInterface.fonts.sansProFont;
import com.naman.daily.userInterface.frame.windowInterface;
import com.naman.daily.userInterface.visibility.onTime;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Time {
    public void getWelcome(windowInterface ui) {

        //Control visibility
        onTime.visibilityOnTime(ui);

        //Font of Choice
        sansProFont font = new sansProFont();

        //Compose Welcome
        StringBuilder welcomeMessage = new StringBuilder();

        //Prep for Message
        ui.getTextAreaMain().setFont(font.getFontStandard());
        ui.getTextAreaMain().append("\n" + "\n");

        //Building Final String - Separated for readability
        welcomeMessage.append(greetingType());
        welcomeMessage.append("Naman Malhotra, the date and time is ");
        welcomeMessage.append(getTime());
        welcomeMessage.append(".");

        //Appending to UI
        ui.getTextAreaMain().append(welcomeMessage.toString());
    }

    private String getTime() {
        Calendar calendar = Calendar.getInstance();

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");

        String time = formatter.format(calendar.getTime());

        return time;
    }

    private String greetingType() {
        int hourInDay = Calendar.getInstance().getTime().getHours() + 1;
        if((hourInDay >= 1 && hourInDay <= 4) || (hourInDay >= 20 && hourInDay <= 24)) {return "Good Night ";}
        if((hourInDay >= 5 && hourInDay <= 11) ) {return "Good Morning ";}
        if(hourInDay >= 12 && hourInDay <= 16) {return "Good Afternoon ";}
        return "Good Evening ";
    }
}

