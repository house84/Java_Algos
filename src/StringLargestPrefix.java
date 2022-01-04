import java.util.Scanner;

//Take in two strings and return the common prefix
public class StringLargestPrefix {

    StringLargestPrefix() {

        //Declare Variables
        String stringOne = "", stringTwo = "", commonPrefix = "";

        Scanner input = new Scanner(System.in);

        //Get First String
        System.out.print("Enter first string: ");
        stringOne = input.nextLine();
        //Split up first String
        String firstArray[] = stringOne.split(" ");

        //Get Second String
        System.out.print("Enter second string: ");
        stringTwo = input.nextLine();
        //Split up Second String
        String secondArray[] = stringTwo.split(" ");

        //Find commonality between strings
        for( int i = 0 ; i < firstArray.length; i++){

            //check
            if( firstArray[i].equals(secondArray[i])){
                commonPrefix += firstArray[i] + " ";
            }
            //Terminate loop if first words do not match
            else { break; }
        }

        if( commonPrefix != "") {
            System.out.print("Common Prefix: " + commonPrefix);
        }
        else{ System.out.print("There is no common prefix."); }

    }
}
