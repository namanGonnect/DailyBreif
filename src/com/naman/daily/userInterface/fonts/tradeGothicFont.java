package com.naman.daily.userInterface.fonts;

import java.awt.*;

public class tradeGothicFont {
    Font fontStandard = new Font("TradeGothic LT", Font.PLAIN,18);
    Font fontBold = new Font("TradeGothic LT", Font.BOLD,18);
    Font fontSlant = new Font("TradeGothic LT", Font.ITALIC,18);
    Font fontTitle = new Font ("TradeGothic LT", Font.PLAIN, 68);

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

    public Font getInstance(Font type) {
        return type;
    }
}
