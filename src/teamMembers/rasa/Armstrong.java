package TeamMembers.Rasa;

public class Armstrong {
    public static void main(String[] args) {

        boolean number = armstrongChecker(153);
        System.out.println(number);

    }

    public static boolean armstrongChecker(int number) {

        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp%10;
            int cube = digit*digit*digit;
            sum += cube;
            temp = temp/10;
        }
        return sum==number;
    }
}

