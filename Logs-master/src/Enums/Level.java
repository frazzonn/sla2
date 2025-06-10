package Enums;

public enum Level {
    DEBUG("\u001B[34m"),
    WARNING("\u001B[33m"),
    ERROR("\u001B[31m");



    private final String colorCode;

    Level(String colorCode) {
        this.colorCode = colorCode;
    }

    public String getColorCode() {
        return colorCode;
    }

    public String colorize(String message) {
        return colorCode + message;
    }

}
