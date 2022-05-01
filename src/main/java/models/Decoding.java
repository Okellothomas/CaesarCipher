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

    public String decode()
    {
        String decodedValue = "";
        String encodedArray[] = userInput.split("");
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i<encodedArray.length;i++)
        {
            if (userInput.charAt(i) == ' ')
            {
                decodedValue += " ";
            }
            else
            {
                int charPosition = alphabet.indexOf(userInput.charAt(i));
                int keyVal = (charPosition - inputKey) % 26;

                if (keyVal < 0)
                {
                    keyVal = alphabet.length() + keyVal;
                }

                char replaceValue = alphabet.charAt(keyVal);
                decodedValue += replaceValue;
            }
        }
        return decodedValue;
    }


}

