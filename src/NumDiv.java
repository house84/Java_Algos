public class NumDiv {
    NumDiv(){
        //Create Count to next line
        int count = 0;

        //Loop from 100-1000
        for(int i = 100; i < 1000; i++){
            //Check for # Div by 5 & 6
            if(i%5==0 && i%6==0){
                count += 1;
                System.out.print(i + " ");
            }
            //New Line reset Count
            if(count == 10){
                count = 0;
                System.out.print("\n");
            }
        }
    }
}
