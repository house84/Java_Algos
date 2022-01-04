import java.util.Scanner;

public class temp {

    temp() {
        double celsius;
        double fahrenheit;
        //create scanner object
        Scanner input = new Scanner(System.in);

        //Prompt for input
        System.out.print("Enter a degree in Celsius: ");
        celsius = input.nextDouble();

        //Do conversion
        fahrenheit = (9.0 / 5) * celsius + 32;

        //print Fahrenheit

        System.out.println(celsius + " Celsius is "
                + fahrenheit + " Fehrenheit");
    }

}
