import java.text.DecimalFormat;
import java.util.*;

public class Area {

    Area(){
        double radius, length, area, volume;

        //Create Scanner Object
        Scanner input = new Scanner(System.in);

        //Ask for input
        System.out.print("Enter the radius of the cylinder: ");
        radius = input.nextDouble();
        System.out.print("Enter the length of the cylinder: ");
        length = input.nextDouble();

        //Calculate Volume and Area
        area = Math.pow(radius, 2) + Math.PI;
        volume = area * length;

        DecimalFormat df = new DecimalFormat("#.##");
        //Print Results
        System.out.println("The area is: " + df.format(area));
        System.out.println("The volume is: " + df.format(volume));

    }
}
