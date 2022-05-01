package models;

public class Encoding {

    private int inputKeys;
    private String userInputs;

    public Encoding(int inputKeys, String userInputs) {
        this.inputKeys = inputKeys;
        this.userInputs = userInputs;
    }

    public int getInputKeys() {
        return this.inputKeys;
    }


    public String getUserInputs() {
        return this.userInputs;
    }

   public String enicode(){
       String theAlphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       String userInput = userInputs.toLowerCase();

        String encodedText = "";

        for (int k = 0; k < userInput.length(); k++){
            int inputValueInInteger = theAlphabets.indexOf(userInput.charAt(k));
            int alphabetLocation = (inputValueInInteger + inputKeys) % 26;
            int replacingAlphabet = theAlphabets.charAt(alphabetLocation);
            encodedText = replacingAlphabet + encodedText;
        }
        return encodedText;
    }

    public String encode()
    {
        String encoded = "";
        String encodedArray[] = userInputs.split("");
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i<encodedArray.length;i++)
        {
//            if (userInputs.charAt(i) == ' ')
//            {
//                encoded += " ";
//            }
//            else
//            {
                int charPosition = alphabet.indexOf(userInputs.charAt(i));
                int key = (inputKeys + charPosition) % 26;
                encoded += alphabet.charAt(key);
//            }
        }
        return encoded.toUpperCase();
    }
    //one

}
