package models;

public class Encoding {

    private int inputKeys;
    private String userInputs;

    public Encoding(int inputKeys, String userInputs) {
        this.inputKeys = inputKeys;
        this.userInputs = userInputs;
    }

    public boolean isKeySet(){
        return true;
    }

}
