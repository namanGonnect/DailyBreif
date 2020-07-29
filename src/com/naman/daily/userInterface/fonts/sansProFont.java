package com.naman.daily.userInterface.fonts;

import java.awt.*;

public class sansProFont {
    private Font fontStandard = new Font("SF Pro Text", Font.PLAIN,18);
    private Font fontBold = new Font("SF Pro Text", Font.BOLD,18);
    private Font fontSlant = new Font("SF Pro Text", Font.ITALIC,18);

    public Font getFontStandard() {
        return fontStandard;
    }

    public Font getFontBold() {
        return fontBold;
    }

    public Font getFontSlant() {
        return fontSlant;
    }

    public Font getFontTitle() {
        return fontTitle;
    }

    private Font fontTitle = new Font ("SF Pro Light", Font.PLAIN, 68);

    public static Font getInstance(Font type) {
        return type;
    }

}
