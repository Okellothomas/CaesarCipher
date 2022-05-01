package models;

public class Decoding {

    private int inputKey;
    private String userInput;
    public static String theAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

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

    public String decode()
    {
        String encipherString = "";
        String encipheruserArray[] = userInput.split("");
        for (int p = 0; p<encipheruserArray.length;p++)
        {
                int charPosition = theAlphabet.indexOf(userInput.charAt(p));
                int keyVal = (charPosition - inputKey) % 26;

                if (keyVal < 0)
                {
                    keyVal = theAlphabet.length() + keyVal;
                }

                char replaceValue = theAlphabet.charAt(keyVal);
                encipherString = encipherString + replaceValue;
            }
        return encipherString;
    }


}

