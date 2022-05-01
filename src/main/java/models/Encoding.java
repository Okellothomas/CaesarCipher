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

    public String encode()
    {
        String  cipherText = "";
        String cipherArray[] = userInputs.split("");
        for (int i = 0; i<cipherArray.length;i++)
        {
                int charPosition = theAlphabets.indexOf(userInputs.charAt(i));
                int key = (inputKeys + charPosition) % 26;
                cipherText += theAlphabets.charAt(key);
        }
        return cipherText.toUpperCase();
    }


}
