package TeamMembers.Egor;

import java.util.HashMap;
import java.util.Map;

public class AddUpToSum {
    public static void main(String[] args) {
        int[] array = {8, 7, 2, 5, 3, 1};
        findPairs(array, 10);
        /*
        7 & 3
        8 & 2
         */
    }
    private static void findPairs(int[] nums, int sum){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == sum){
                    map.put(nums[i], nums[j]);
                }
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " & " + entry.getValue());
        }
    }
}
