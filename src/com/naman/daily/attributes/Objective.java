package com.naman.daily.attributes;

import com.naman.daily.userInterface.dailyReportDesign;
import com.naman.daily.userInterface.fonts.sansProFont;
import com.naman.daily.userInterface.frame.windowInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Objective {

    public void getObjectiveMessage(windowInterface ui) {

        //Font of Choice
        sansProFont font = new sansProFont();

        //Compose Welcome
        StringBuilder welcomeMessage = new StringBuilder();

        //Prep for Message
        ui.getTextAreaMain().setFont(font.getFontSlant());
        ui.getTextAreaMain().append("\n" + "\n");

        //Building Final String - Separated for readability
        welcomeMessage.append("Remember to: ");
        welcomeMessage.append(getObjective());
        welcomeMessage.append(".");

        //Appending to UI
        ui.getTextAreaMain().append(welcomeMessage.toString());
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
