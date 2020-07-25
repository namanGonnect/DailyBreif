package com.naman.daily.attributes;

import com.naman.daily.userInterface.dailyReportDesign;
import com.naman.daily.userInterface.fonts.sansProFont;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Time {
    public void getWelcome(dailyReportDesign ui) {

        //Font of Choice
        sansProFont font = new sansProFont();

        //Compose Welcome
        StringBuilder welcomeMessage = new StringBuilder();

        //Prep for Message
        ui.getTextPain().setFont(font.getFontBold());
        ui.getTextPain().append("\n" + "\n");

        //Building Final String - Separated for readability
        welcomeMessage.append(greetingType());
        welcomeMessage.append("Naman Malhotra, the date and time is ");
        welcomeMessage.append(getTime());
        welcomeMessage.append(".");

        //Appending to UI
        ui.getTextPain().append(welcomeMessage.toString());
    }

    private String getTime() {
        Calendar calendar = Calendar.getInstance();

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");

        String time = formatter.format(calendar.getTime());

        return time;
    }

    private String greetingType() {

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("HH");
        String time = formatter.format(calendar.getTime());
        String greetingType = null;

        String[] possibleTimes = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"};

        for (int i = 0; i < possibleTimes.length; i++) {
            switch (possibleTimes[i]) {
                case "0", "1", "2", "3", "20", "21", "22", "23", "24": {
                    greetingType = "Good Night ";
                    break;
                }
                case "4": {
                    greetingType = "Early Morning to you, ";
                    break;
                }
                case "5", "6", "7", "8", "9", "10", "11": {
                    greetingType = "Good Morning ";
                    break;
                }
                case "12", "13", "14", "15", "16": {
                    greetingType = "Good Afternoon ";
                    break;
                }
                case "17", "18", "19": {
                    greetingType = "Good Evening ";
                    break;
                }
            }

        }
        return greetingType;
    }
}

