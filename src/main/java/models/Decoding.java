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

    public void setInputKey(int inputKey) {
        this.inputKey = inputKey;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public String decode()
    {
        String encipherString = "";
        String encipheruserArray[] = userInput.split("");
        for (int p = 0; p<encipheruserArray.length;p++)
        {
                int positionOfCharacter = theAlphabet.indexOf(userInput.charAt(p));
                int inputUserKey = (positionOfCharacter - inputKey) % 26;

                if (inputUserKey < 0)
                {
                    inputUserKey = theAlphabet.length() + inputUserKey;
                }

                char replaceValue = theAlphabet.charAt(inputUserKey);
                encipherString = encipherString + replaceValue;
            }
        return encipherString;
    }


}

