package models;

public class Decoding {

    private int inputKey;
    private String userInput;

    public Decoding(int inputKey, String userInput) {
        this.inputKey = inputKey;
        this.userInput = userInput;
    }

    public int getInputKey() {
        return inputKey;
    }

    public String getUserInput() {
        return userInput.toLowerCase();
    }




}

