import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Statistics {
    DecimalFormat df = new DecimalFormat(".000");

    Statistics(){
        int size;
        Scanner input = new Scanner(System.in);

        //Get the number of inputs need from user
        System.out.print("This program will output Statistics from input numbers.\n");
        System.out.print("Enter the number of values you would like to enter: ");
        size = input.nextInt();

        //Create array of values
        double[] array = new double[size];

        //Populate array with user inputs
        for(int i = 0; i < array.length; i++ ){
            System.out.print("Enter value (" + (i+1) + "): ");
            array[i] = input.nextDouble();
        }

        System.out.print("Mean: " + df.format(Mean(array)));
        Median(array);
        Mode(array);
        StandardDeviation(array);
    }

    double Mean(double[] array){

        //Calculate Mean and Display
        double mean, sum = 0;
        int total = array.length;

        for(int i = 0; i < array.length; i++){ sum += array[i]; }

        mean = sum/total;

        return mean;
    }

    void Median(double[] array){
        Arrays.sort(array);
        int position = array.length/2;
        double sum = 0;
        if( position % 2 == 0 ) {

            for(int i = position-1; i<position+1; i++){
                sum += array[i];
            }
            System.out.print("\nMedian: " + (sum/2));
        }
        else {
            System.out.print("\nMedian: " + array[position]);
        }
    }

    void StandardDeviation(double[] array){
        double mean = Mean(array);
        double sum = 0;
        double summation = 0;
        double SD;

        for(int i = 0; i < array.length; i++){
            sum = array[i] - mean;
            summation += Math.pow(sum, 2);
        }

        SD = Math.sqrt((summation/array.length));

        System.out.print("\nStandard Deviation: " + df.format(SD));
    }

    void Mode(double[] array){
        int count = 0 , index = -1, max = 0, temp = 0;
        List modeList = new ArrayList();

        for (int i = 0; i < array.length-1; i++){
            if( array[i] == array[i+1]){
                count += 1;

                if( count > max){
                    index = i;
                    max = count;
                }
                if(count == max ){
                modeList.add(array[i]);
                temp += 1;
                }
            } else if (array[i] != array[i+1]) {
                count = 0;
            }
        }

        if(index == -1){
            System.out.print("\nMode: There is no Mode");
        }
        else if ( temp > 1 ) {
            System.out.print("\nMode: "+ Arrays.toString(modeList.toArray()));
        }
        else { System.out.print("\nMode: " + array[index]);  }
    }
}
