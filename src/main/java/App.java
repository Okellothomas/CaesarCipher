import models.Encoding;
import models.Decoding;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Console;

public class App {
    public static void main(String[] args) throws IOException {
        // get user input text and key;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The word to Encode: ");
        String userString = bufferedReader.readLine();
        // get user key.
        System.out.println("Enter the key for encryption:");
        String userKey = bufferedReader.readLine();
        int intUserKey = Integer.parseInt(userKey);
        Encoding encoding = new Encoding(intUserKey, userString);
        System.out.println("Your encoded word is: " + encoding.encode());
    }
}