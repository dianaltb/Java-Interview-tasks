package TeamMembers.Egor;

import java.util.Random;

public class BinaryRepresentation {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(50) + 1;

        howManyOnes(num);
        //47 has the binary representation of 101111. So the number of "1" is: 5.
    }

    public static void howManyOnes(int num){
        String binary = Integer.toBinaryString((num));
        int count = 0;
        for(char ch : binary.toCharArray()){
            if(ch == '1'){
                count++;
            }
        }
        System.out.println(num + " has the binary representation of " +
                binary + ". So the number of \"1\" is: " + count + ".");
    }
}
