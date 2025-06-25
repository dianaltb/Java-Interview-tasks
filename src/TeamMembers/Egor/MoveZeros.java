package TeamMembers.Egor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeros {
    public static void main(String[] args) {
        List<Integer> original = new ArrayList<>(Arrays.asList(5, 0, 0, 1, 4, 0, 14, 1));
        System.out.println("Original: " + original);
        List<Integer> updated = moveZeros(original);
        System.out.println("Updated: " + updated);
        /*
        Original: [5, 0, 0, 1, 4, 0, 14, 1]
        Updated: [5, 1, 4, 14, 1, 0, 0, 0]
         */
    }

    private static List<Integer> moveZeros(List<Integer> list){
        List<Integer> result = new ArrayList<>();
        for(int num : list){
            if(num != 0){
                result.add(num);
            }
        }
        while(list.size() > result.size()){
            result.add(0);
        }
        return result;
    }
}
