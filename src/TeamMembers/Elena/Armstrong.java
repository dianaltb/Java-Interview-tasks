package TeamMembers.Elena;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(371));
        System.out.println(isArmstrong(9474));

        System.out.println("----------------------");

        System.out.println(isArmstrong2(153));

    }


    public static boolean isArmstrong(int num) {

        String strNum = "" + num;
        int power = strNum.length(); // how many digits I had in my number
        int sum = 0;

        System.out.println(strNum.length());

        for (int i = 0; i < strNum.length(); i++) { // iterate my string

            int eachDigit = Integer.parseInt(strNum.substring(i, i + 1)); /*(""+ strNum.charAt(i));*/
            //now i have each digit

            sum += Math.pow(eachDigit, power); // each digit ^ power

        }
        return sum == num;
    }

    //*************************************ANOTHER WAY OF SOLVING ARMSTRONG******************************************

    public static boolean isArmstrong2(int num) {

        int temp = num;
        int digits = 0;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = num; // assigns num value again
        int sum = 0;

        while (temp > 0){
            int eachDigit = temp % 10; // read the last digit
            sum += Math.pow(eachDigit,digits);
            temp /= 10;
        }
        return sum == num;

    }
}

