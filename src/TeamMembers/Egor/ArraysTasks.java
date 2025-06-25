package TeamMembers.Egor;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ArraysTasks {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5};
        int[] output = reverseArray(input);
        System.out.println(Arrays.toString(output));
        findMinMax(input);
        countEvenOdd(input);
        int[] third = mergeArrays(input, output);
        System.out.println(Arrays.toString(third));
        int[] arr = {4, 5, 6, 4, 2, 5, 3};
        findDuplicates(arr);
    }

    private static int[] reverseArray(int[] nums){
        int[] result = new int[nums.length];
        for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {
            result[i] = nums[j];
        }
        return result;
    }

    private static void findMinMax(int[] nums){
        int min = nums[0];
        int max = nums[0];
        for(int num : nums){
            if(num < min){
                min = num;
            } else if(num > max){
                max = num;
            }
        }
        System.out.println("Max: " + max + ", Min: " + min);
    }

    private static void countEvenOdd(int[] nums){
        int even = 0;
        int odd = 0;
        for(int num : nums){
            if(num % 2 == 0){
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even: " + even + ", Odd: " + odd);
    }

    private static int[] mergeArrays(int[] first, int[] second){
        int[] result = new int[first.length + second.length];
        for (int i = 0; i < result.length; i++) {
            if(i < first.length){
                result[i] = first[i];
            } else {
                result[i] = second[i - first.length];
            }
        }
        return result;
    }

    private static void findDuplicates(int[] nums){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    set.add(nums[i]);
                }
            }
        }
        System.out.print("Duplicates: " +
                set.stream()
                        .map(n -> String.valueOf(n))
                        .collect(Collectors.joining(", ")));

//        System.out.print("Duplicates: ");
//        boolean first = true;
//        for(int num : set){
//            if(!first){
//                System.out.print(", ");
//            }
//            System.out.print(num);
//            first = false;

    }
}
