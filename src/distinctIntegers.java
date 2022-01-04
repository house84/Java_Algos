import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class distinctIntegers {
    distinctIntegers() {
        int[] array = new int[10];
        List<Integer> list = new ArrayList<>();

        int count = 0, flag = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 integers.\n");

        for( int i = 0 ; i < array.length; i++){
            System.out.printf("%d: ", (i+1));
            array[i] = input.nextInt();
            flag = 0;

            for(int j = 0; j < count ; j++ ) {
                if( list.get(j) == array[i]) { flag = 1; break; }
            }

            if( flag == 0 ) {
                list.add(array[i]);
                ++count;
            }
        }

        System.out.printf("There is %d distinct integers.\n", count);
        for(int i = 0; i < count ; i++){
            System.out.printf("%d ", list.get(i));
        }
    }
}
