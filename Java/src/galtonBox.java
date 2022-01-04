import java.util.InputMismatchException;
import java.util.Scanner;

public class galtonBox {
    static int balls;
    static int slots = 1;
    static int LR, sum=0;
    public static final Scanner input = new Scanner(System.in);

    galtonBox(){

        setBalls();
        setSlots();
        //getBalls();
        //getSlots();

        //Create Array to hold "balls" and initialize them to 0
        int[] array = new int[slots];
        for(int i = 0; i < array.length; i++){ array[i] = 0; }

        galton(array);



    }

    static void galton(int[] array){

        //Create Galton box Simulator
        for(int n = 0 ; n < balls; n++ ) {
            sum = 0;
            System.out.print("\nPath of Ball " + (n+1) + ": " );
            for (int i = 0; i < slots - 1; i++) {
                LR = (int) Math.round(Math.random());
                if (LR == 1) {
                    sum += 1;
                }
                if (LR == 0) {
                    System.out.print("L ");
                } else {
                    System.out.print("R ");
                }
            }
            array[sum] += 1;
        }

        System.out.println();
        printGalton(array);

    }

    static void printGalton(int[] array){
        int max = 0;
        int count = 0;
        String output = " ";
        for(int i = 0; i < array.length; i++ ){
            //System.out.print(array[i]+" ");
            if(array[i] > max ) { max = array[i]; }
            output += array[i]+ " ";
        }
        
        System.out.println();
        count = max;
        System.out.print("Histogram of Ball Locations");
        System.out.print("\n---");
        for(int i = 0; i < array.length-1; i++){
            System.out.print("--");
        }

        for(int i = 0; i < max; i++ ){
            System.out.println();
            for(int j = 0; j < array.length; j++){
                if( j == 0){
                    if( array[j] == count ) { System.out.print("|0|"); array[j] -= 1; }
                    else {
                        System.out.print("| |");
                    }
                }
                else {
                    if( array[j] == count ) { System.out.print("0|"); array[j] -= 1; }
                    else {
                        System.out.print(" |");
                    }

                }
            }
            --count;
        }
        System.out.print("\n---");
        for(int i = 0; i < array.length-1; i++){
            System.out.print("--");
        }
        System.out.print("\n"+output);
    }


    static void setBalls() {
        //Prompt User for number of balls to drop.
        System.out.print("How many balls would you like to drop in the Galton Box? ");

        //Scanner input = new Scanner(System.in);
        while(balls < 1 || balls > 100 ){
            System.out.print("\nEnter number of balls (1-100): ");
            while (!input.hasNextInt()) {
                System.out.print("Not valid, a number between 1-100:  ");
                String tryagain = input.next();
            }
            balls = input.nextInt();
        }
    }

    static void getBalls(){ System.out.print("\nBalls: " + balls); }

    static void setSlots(){
        //How many Slots
        System.out.print("How many slots would you like the Galton Box to have?\n");

        //Take user input and validate
        while( slots % 2 != 0){
            System.out.print("Enter even number: ");
            while (!input.hasNextInt()) {
                System.out.print("Not valid, enter an even number:  ");
                String tryagain = input.next();
            }
            slots = input.nextInt();
        }
    }

    static void getSlots(){ System.out.print("\nSlots: " + slots); }

}
