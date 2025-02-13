package main.enums;

public enum Color {

    BLACK(30),
    RED(31),
    GREEN(32),
    YELLOW(33),
    BLUE(34),
    MAGENTA(35),
    CYAN(36),
    GRAY(37),
    WHITE(97);

    private final String fontCode;
    private final String backgroundCode;

    Color(int base) {
        this.fontCode = "\033[" + base + "m";
        this.backgroundCode = "\033[" + (base + 10) + "m";
    }

    public String getFontCode() {
        return fontCode;
    }

    public String getBackgroundCode() {
        return backgroundCode;
    }

}
