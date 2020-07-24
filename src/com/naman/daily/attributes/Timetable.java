package com.naman.daily.attributes;

import com.naman.daily.user_interface.DailyReportDesign;
import com.naman.daily.user_interface.fonts.SansProFont;

import java.util.Calendar;

public class Timetable {
    String[][] timetable = dataForTimeTable();

    private String[][] dataForTimeTable() {
        timetable = new String[7][10];
        //sunday
        timetable[0] = new String[]{"Free", "Free", "Geo B4", "Drama B9", "Drama B9", "Bio B7", "English V8", "Dutch ?"};
        //monday
        timetable[1] = new String[]{"Free", "Spanish ?", "Arts Z3", "Arts Z3", "English V2", "English V2", "Math ?", "Math ?", "Science B7"};
        //tuesday
        timetable[2] = new String[]{"Free", "Math ?", "Dutch ?", "Design Z4", "Design Z4", "Geo B4", "Bio B5", "History V5"};
        //wednesday
        timetable[3] = new String[]{"Free", "Free", "Geo B4", "Drama B9", "Drama B9", "Bio B7", "English V8", "Dutch ?"};
        //thursday
        timetable[4] = new String[]{"Free", "Free", "Geo B4", "Drama B9", "Drama B9", "Bio B7", "English V8", "Dutch ?"};
        //friday
        timetable[5] = new String[]{"Free", "Free", "Geo B4", "Drama B9", "Drama B9", "Bio B7", "English V8", "Dutch ?"};
        //saturday
        timetable[6] = new String[]{"Free", "Free", "Geo B4", "Drama B9", "Drama B9", "Bio B7", "English V8", "Dutch ?"};
        return timetable;
    }


    public void getTimeTable(DailyReportDesign ui) {
        try {

            SansProFont font = new SansProFont();
            ui.getTextPain().setFont(font.getFontStandard());

            if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) > 17) {
                ui.getTextPain().append("\n" + "\n" + "All Done For Today :)");
            } else {

                ui.getTextPain().append("\n");
                String day = null;

                if (Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == 2) {
                    day = "Monday";
                }
                if (Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == 3) {
                    day = "Tuesday";
                }
                if (Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == 4) {
                    day = "Wednesday";
                }
                if (Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == 5) {
                    day = "Thursday";
                }
                if (Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == 6) {
                    day = "Friday";
                }
                if (Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == 0) {
                    day = "Saturday";
                }
                if (Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == 1) {
                    day = "Sunday";
                }

                ui.getTextPain().append("\n" +
                        "Timetable For " + day +
                        ":" + "\n");

                Calendar.getInstance().getTime().toString();
                printTimeTable(Calendar.getInstance().get(Calendar.DAY_OF_WEEK), ui);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void printTimeTable(int day, DailyReportDesign ui) {
        String[] subjects = timetable[day];
        try {
            ui.getTextPain().append("\n");
            for (int counter = 0; counter < subjects.length; ++counter) {
                ui.getTextPain().append("+---+-------------+\n");
                ui.getTextPain().append("| " + (counter + 1) + " | ");
                ui.getTextPain().append(subjects[counter]);
                for (int padCounter = 0; padCounter < (12 - subjects[counter].length()); ++padCounter) {
                    ui.getTextPain().append(" ");
                }
                ui.getTextPain().append("|\n");
            }
            ui.getTextPain().append("+---+-------------+");
            ui.getTextPain().append("\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
