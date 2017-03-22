package com.company;

public class Chess {
    private int FirstStep;
    private int NextStep;
    private String name;
    private String color;
    private String white;
    private String black;

    public Chess(int firstStep, int nextStep, String name, String color, String white, String black) {
        FirstStep = firstStep;
        NextStep = nextStep;
        this.name = name;
        this.color = color;
        this.white = white;
        this.black = black;
    }

    public int getFirstStep() {
        return FirstStep;
    }

    public void setFirstStep(int firstStep) {
        FirstStep = firstStep;
    }

    public int getNextStep() {
        return NextStep;
    }

    public void setNextStep(int nextStep) {
        NextStep = nextStep;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWhite() {
        return white;
    }

    public void setWhite(String white) {
        this.white = white;
    }

    public String getBlack() {
        return black;
    }

    public void setBlack(String black) {
        this.black = black;
    }
}
