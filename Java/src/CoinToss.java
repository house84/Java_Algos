import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CoinToss {
    CoinToss(){
        //Create Variables and input
        Scanner input = new Scanner(System.in);
        int answer;


        System.out.print("This program will flip a coin, try to guess Heads or Tails.\n");
        System.out.print("***SELECT***\n(1)Heads\n(2)Tails\n");

        answer = input.nextInt();
        switch (answer){
            case 1: {
                System.out.print("You Selected Heads");
                CoinToss(1);
                break;
            }

            case 2: {
                System.out.print("You selected Tails");
                CoinToss(0);
                break;
            }

            default: {
                System.out.print("You entered an invalid choice.");
                break;
            }
        }
    }

    void CoinToss(int x){
        String guess;

        int Coin = (int) Math.round(Math.random());
        System.out.print("\nFlipping Coin....\n");
        //Pause for dramatic effect
        try {
          Thread.sleep(1000);
        } catch (Exception e){
            e.printStackTrace();
        }

        if(Coin == 1 ) {
            System.out.print("Coin landed on Heads.\n");
        }
        else if(Coin == 0) {
            System.out.print("Coin landed on Tails.\n");
        }

        if( x == 1 && Coin == 1 ){
            System.out.print("The coin landed on Heads, you picked correct.");
        }
        if( x == 0 && Coin == 1 ){
            System.out.print("The coin landed on Heads, you picked wrong.");
        }
        if( x == 1 && Coin == 0 ){
            System.out.print("The coin landed on Tails, you picked wrong.");
        }
        if( x == 0 && Coin == 0 ){
            System.out.print("The coin landed on Tails, you picked correct");
        }
    }
}
