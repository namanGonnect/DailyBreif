package com.naman.daily.userInterface.fonts;

import java.awt.*;

public class sansProFont {
    Font fontStandard = new Font("SF Pro Text", Font.PLAIN,18);
    Font fontBold = new Font("SF Pro Text", Font.BOLD,18);
    Font fontSlant = new Font("SF Pro Text", Font.ITALIC,18);

    public Font getFontStandard() {
        return fontStandard;
    }

    public Font getFontBold() {
        return fontBold;
    }

    public Font getFontSlant() {
        return fontSlant;
    }

    public Font getInstance(Font type) {
        return type;
    }
}
