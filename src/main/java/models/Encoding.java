package models;

public class Encoding {

    private int inputKeys;
    private String userInputs;
    public static String theAlphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public Encoding(int inputKeys, String userInputs) {
        this.inputKeys = inputKeys;
        this.userInputs = userInputs;
    }

    public int getInputKeys() {
        return inputKeys;
    }


    public String getUserInputs() {
        return userInputs;
    }

    public void setInputKeys(int inputKeys) {
        this.inputKeys = inputKeys;
    }

    public void setUserInputs(String userInputs) {
        this.userInputs = userInputs;
    }

    public String encode()
    {
        String  cipherText = "";
        String cipherArray[] = userInputs.split("");
        for (int p = 0; p<cipherArray.length;p++)
        {
                int charPosition = theAlphabets.indexOf(userInputs.charAt(p));
                int key = (inputKeys + charPosition) % 26;
                cipherText += theAlphabets.charAt(key);
        }
        return cipherText.toUpperCase();
    }


}
