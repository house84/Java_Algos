import java.text.DecimalFormat;
import java.util.*;

public class QuadraticEquation {

    QuadraticEquation() {

        //declare variables
        double a, b, c, r1, r2;
        double d; //discriminant

        //Create scanner object
        Scanner input = new Scanner(System.in);

        //Prompt User for inputs
        System.out.print("Enter variable for a:");
        a = input.nextDouble();
        System.out.print("Enter variable for b:");
        b = input.nextDouble();
        System.out.print("Enter variable for c:");
        c = input.nextDouble();

        //Math equations
        d = (Math.pow(b,2) - 4*a*c);
        r1 = ((-b + Math.pow(d, .5))/(2*a));
        r2 = ((-b - Math.pow(d,.5))/(2*a));

        //Decimal Format
        DecimalFormat df = new DecimalFormat("#.###");

        if( d > 0){
            System.out.print("The roots are:\n" +
                    "r1: " + r1 + "\n" +
                    "r2: " + r2);
        }
        else if(d ==0){
            System.out.print("Root is r1 = r2 = " +
                    (-b)/(2*a));
        }
        else if( d < 0){
            System.out.print("No real roots.");
        }
    }
}
