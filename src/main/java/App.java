
import models.Encoding;
import models.Decoding;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Console;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        // get user input text and key;
        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // prompt users on what they want to do:
        System.out.println("Enter 1. to encode \n and 2. to Decode");
        int userchoice = scanner.nextInt();
        scanner.nextLine();

        if (userchoice == 1){

            System.out.println("Enter The word to Encode: ");
            String userString = scanner.nextLine().toUpperCase();
            // get user key.
            System.out.println("Enter the key for encryption:");
            int intUserKey = scanner.nextInt();
            Encoding encoding = new Encoding(intUserKey, userString);
            System.out.println(encoding.encode());

        } else if (userchoice == 2){

            System.out.println("Enter The word to Decode: ");
            String userString = bufferedReader.readLine().toUpperCase();
            // get user key.
            System.out.println("Enter the key for decoding:");
            int intUserKey = scanner.nextInt();
            Decoding decoding = new Decoding(intUserKey, userString);
            System.out.println(decoding.decode());

        } else{
            System.out.println("Enter either 1 or 2");
        }

    }
}
