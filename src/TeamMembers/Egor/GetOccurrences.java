package TeamMembers.Egor;

public class GetOccurrences {
    public static void main(String[] args) {
        System.out.println(getOccurrences("aaabbccddab"));
        //a3b2c2d2a1b1
    }

    private static String getOccurrences(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == str.charAt(i)) {
                count++;
            } else {
                sb.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        sb.append(str.charAt(str.length() - 1)).append(1);
        return sb.toString();
    }
}
