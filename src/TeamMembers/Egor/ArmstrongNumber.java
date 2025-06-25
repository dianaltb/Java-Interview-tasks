package TeamMembers.Egor;

public class ArmstrongNumber {
    public static void main(String[] args) {

        System.out.println("The Armstrong numbers from 1 to 1000 are:");
        for (int i = 1; i < 1000; i++) {
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
        //The Armstrong numbers from 1 to 1000 are:
        //1 2 3 4 5 6 7 8 9 153 370 371 407
    }

    public static boolean isArmstrong(int num){
        int length = String.valueOf(num).length();
        int initial = num;
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            sum += (int)Math.pow(digit, length);
            num /= 10;
        }
        return initial == sum;
    }
}
