package TeamMembers.Egor;

import java.util.ArrayList;
import java.util.List;

public class ExtractNums {
    public static void main(String[] args) {
        System.out.println("Max: " + extractMax("arb65rd24adjh1"));
        //Max: 65
    }

    public static int extractMax(String str){
        List<Integer> list = new ArrayList<>();
        String number = "";
        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                number += str.charAt(i);
            } else if(!number.isEmpty()){
                list.add(Integer.parseInt(number));
                number = "";
            }
        }
        int max = list.getFirst();
        for(int num : list){
            if(num > max){
                max = num;
            }
        }
        return max;
    }
}
