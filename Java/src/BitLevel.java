import java.util.Scanner;

public class BitLevel {
    BitLevel(){

        //Prompt User for an integer input
        System.out.print("Enter and integer: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int x = 1;

        //Loop and create 16 Bit Binary Output
        for(int i = 15; i >= 0; i --){
            int temp = num >> i;
            //System.out.print(temp);
            int bit = temp & x;
            System.out.print(bit);
        }
    }
}
