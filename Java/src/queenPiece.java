public class queenPiece {
    //Place 8 Queens on a board such that no single one can attack the other.

    queenPiece(){
        enumerate1(8);
    }

    static void enumerate1(int x){
        //Create Dynamic Array
        int[] array = new int[x];
        enumerate2(array, 0);
    }

    static void enumerate2(int[] array, int x){
        //Declare N value as array length
        int N = array.length;

        //Check input x to see if equal to N
        if(x == N) { displayBord(array); }
        else {
            for(int i = 0; i < N; i++ ) {
                //Store i
                array[x] = i;
                //check for other queens
                if (isConsistent(array, x)) {
                    enumerate2(array, x+1);
                }
            }
        }
    }

    static boolean isConsistent(int[] array, int x){
        //check for conflicting queen placement
        for( int i = 0; i < x; i++){
            if( array[i] == array[x]) { return false; } //same column
            if( array[i] - array[x] == ( x - i )) { return false; } //same major diagonal
            if( array[x] - array[i] == ( x - i )) { return false; } //same minor diagonal
        }
        return true;
    }

    static void displayBord(int[] array){
        //display board
        int N = array.length;
        System.out.print("\n-------------------------------------------------\n");

        for( int i = 0; i < N; i++){
            for( int j = 0; j<N; j++) {
                if (j == 0) {
                    if (array[i] == j) {
                        System.out.print("|  Q  |");
                    } else {
                        System.out.print("|     |");
                    }
                }
                else {
                    if (array[i] == j) {
                        System.out.print("  Q  |");
                    } else {
                        System.out.print("     |");
                    }
                }
            }

            System.out.println("\n-------------------------------------------------");
        }
        System.exit(0);
    }
}
