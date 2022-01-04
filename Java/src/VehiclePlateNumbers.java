public class VehiclePlateNumbers {
    VehiclePlateNumbers(){
        //Create arrray to hold characters Upper
        char array[] = new char[3];
        //Create Number
        int number = (int)(Math.random()*10000);
        //Turn Number into String
        String sNumber = String.format("%04d", number);

        //Randomly generate Letters
        //ASCII cod for A-Z is 65-90
        for(int i=0; i < array.length; i++){
            array[i] = (char)((int)(Math.random()*26+65));
            //System.out.print("\n" + array[i]);
        }

        System.out.print("\nThe plate's number is: " +
                array[0] + array[1] + array[2] + sNumber);
    }
}
