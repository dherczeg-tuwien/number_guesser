package main;

import main.enums.Color;
import main.enums.TextDecoration;

public class OutputFormatter {

    public static String applyForegroundColor(Color toApply, String textToColor, boolean reset) {
        String coloredText = toApply.getFontCode() + textToColor;
        if (reset) {
            coloredText += TextDecoration.NONE.getCode();
        }
        return coloredText;
    }

    public static String applyBackgroundColor(Color toApply, String textToColor, boolean reset) {
        String coloredText = toApply.getBackgroundCode() + textToColor;
        if (reset) {
            coloredText += TextDecoration.NONE.getCode();
        }
        return coloredText;
    }

    public static String applyDecoration(TextDecoration toApply, String textToDecorate, boolean reset) {
        String decoratedText = toApply.getCode() + textToDecorate;
        if (reset) {
            decoratedText += TextDecoration.NONE.getCode();
        }
        return decoratedText;
    }

}
