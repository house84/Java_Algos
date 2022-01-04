import java.util.Scanner;

public class findNums {

    //Program takes user n number of inputs and gives avg, #pos, #neg

    findNums() {
        //Define Variables
        int pos = 0, neg = 0, count = 0, value;
        double avg = 0;

        Scanner input = new Scanner(System.in);
        //Take user input
        System.out.print("*** Get Number of Pos, Neg and Avg of Integers ***");
        System.out.print("\nEnter as many integers as wanted, then enter 0 when done.\n");
        value = input.nextInt();

        while ( value != 0) {

            count += 1;

            if( value > 0 ) { pos += 1; }

            if( value < 0 ) { neg += 1; }

            avg += value;

            value = input.nextInt();
        }

        if( count == 0 ) { System.out.print("No input entered other than 0."); }
        else {
            System.out.print("Number of Positive Integers: " + pos);
            System.out.print("\nNumber of Negative Integers: " + neg);
            System.out.printf("\nAverage of inputs: %.2f", avg/count);
        }

    }
}
