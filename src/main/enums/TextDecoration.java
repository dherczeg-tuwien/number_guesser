package main.enums;

public enum TextDecoration {

    NONE(0),
    BOLD(1),
    UNDERLINE(4),
    BLINK(5),
    INVERT(7);

    private final String code;

    TextDecoration(int base) {
        this.code = "\033[" + base + "m";
    }

    public String getCode() {
        return code;
    }

}
