package TeamMembers.Egor;

public class NumsToWords {
    public static void main(String[] args) {
        System.out.println(numToWord(47));
    }

    private static String numToWord(int limit){
        String[] units = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        String[] teens = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                "sixteen", "seventeen", "eighteen", "nineteen" };
        String[] tens = { "", "", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety" };
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= limit; i++) {
            sb.append("Number is: ");
            if(i == 0){
                sb.append("zero");
            } else if(i < 10){
                sb.append(units[i]);
            } else if(i < 20){
                sb.append(teens[i - 10]);
            } else {
                int ten = i / 10;
                int unit = i % 10;
                sb.append(tens[ten]);
                if (unit > 0) {
                    sb.append("-").append(units[unit]);
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
