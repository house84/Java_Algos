import java.util.Scanner;

//Count number of letters in a String calling a method
public class StringsLetterCount {
    StringsLetterCount(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        int letters = countLetters(s);

        System.out.printf("This string contains %d letters", letters);
    }

    public static int countLetters(String s){
        int count = 0;

        for( int i = 0; i < s.length(); i++){
            if( Character.isLetter(s.charAt(i))){
                count += 1;
            }
        }

        return count;
    }
}
