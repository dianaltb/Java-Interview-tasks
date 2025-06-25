package teamMembers.diana;

public class SplitSentnce {
    public static void main(String[] args) {

        String str="I love Java";
      String [] array= str.split(" ");
        String reversed="";
        for (int i = array.length-1; i >=0; i--) {
            reversed+=array[i]+" ";
        }
        reversed=  reversed.trim();
        System.out.println(reversed);
    }
}
