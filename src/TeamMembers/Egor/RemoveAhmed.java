package TeamMembers.Egor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAhmed {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        System.out.println(removeAhmed(list));
        //[John, Eric]
    }

    private static List<String> removeAhmed(List<String> list){
        list.removeIf(n -> n.equalsIgnoreCase("Ahmed"));
        return list;
    }
}
