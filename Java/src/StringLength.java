import java.util.Scanner;

public class StringLength {
    StringLength(){
        //Create Input String Variable
        String s;

        //Create Scanner Object
        Scanner input = new Scanner(System.in);

        //Prompt User to input a string
        System.out.print("Enter a word: ");
        s = input.nextLine();

        //Display string length
        System.out.print("Word length is: " + s.length());

        //Display first Letter
        System.out.print("\nFirst letter is: " + s.charAt(0));
    }
}
