package com.naman.daily.attributes;

import com.naman.daily.user_interface.DailyReportDesign;
import com.naman.daily.user_interface.fonts.SansProFont;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Objective {

    public void getObjectiveMessage(DailyReportDesign ui) {

        //Font of Choice
        SansProFont font = new SansProFont();

        //Compose Welcome
        StringBuilder welcomeMessage = new StringBuilder();

        //Prep for Message
        ui.getTextPain().setFont(font.getFontSlant());
        ui.getTextPain().append("\n" + "\n");

        //Building Final String - Separated for readability
        welcomeMessage.append("Remember to: ");
        welcomeMessage.append(getObjective());
        welcomeMessage.append(".");

        //Appending to UI
        ui.getTextPain().append(welcomeMessage.toString());
    }

    private String getObjective() {

        String objective = null;

        Map<Integer, String> possibleObjectives = new HashMap<>(5);
        possibleObjectives.put(0, "Take It Easy");
        possibleObjectives.put(1, "Name One Thing You Are Grateful For");
        possibleObjectives.put(2, "Focus On Positives");
        possibleObjectives.put(3, "Accept Imperfection");
        possibleObjectives.put(4, "Celebrate Little Victories");

        Integer randomNumber = new Random().nextInt(4);
        objective = possibleObjectives.get(randomNumber);

        return objective;
    }

}
