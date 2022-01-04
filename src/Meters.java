import java.text.DecimalFormat;
import java.text.Format;
import java.util.*;

public class Meters {

     void Meters() {

        double feet, meters;
        double constant = .305;

        //Create new scanner object
        Scanner input = new Scanner(System.in);

        //Prompt user for input
        System.out.print("Enter a value for feet: ");
        feet = input.nextDouble();

        meters = feet*constant;

        DecimalFormat df = new DecimalFormat("#.###");

        //Show result
        System.out.println(df.format(feet) + " feet is " + df.format(meters) + " meters.");

    }
}
