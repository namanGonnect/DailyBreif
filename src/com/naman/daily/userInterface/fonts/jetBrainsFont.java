package com.naman.daily.userInterface.fonts;

import java.awt.*;

public class jetBrainsFont {
    private Font fontStandard = new Font("JetBrains Mono", Font.PLAIN,18);
    private Font fontBold = new Font("JetBrains Mono", Font.BOLD,18);
    private Font fontSlant = new Font("JetBrains Mono", Font.ITALIC,18);
    private Font fontTitle = new Font ("JetBrains Mono", Font.PLAIN, 68);

    public Font getFontStandard() {
        return fontStandard;
    }

    public Font getFontBold() {
        return fontBold;
    }

    public Font getFontTitle() {
        return fontTitle;
    }

    public Font getFontSlant() {
        return fontSlant;
    }

    public sansProFont getInstance(sansProFont type) {
        return type;
    }
}
