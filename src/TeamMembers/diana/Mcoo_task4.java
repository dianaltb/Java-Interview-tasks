package teamMembers.diana;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mcoo_task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listOfNames = new ArrayList<>();
        List<Integer> listOfAge = new ArrayList<>();

        System.out.println("Type name and age, empty line stops the input ");
        while (true) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                System.out.println("line is empty");
                break;
            }
            String[] parts = line.split(",");


            int age = Integer.parseInt(parts[1]);
            listOfAge.add(age);
        }
        String longest = listOfNames.get(0);
        for (String eachName : listOfNames) {
            if (eachName.length() > longest.length()) {
                longest = eachName;

            }
        }
        double sum=0;
        for (Integer eachYear : listOfAge) {
            sum+=eachYear;
        }
        double averageYear= sum/listOfAge.size();
        System.out.println("averageYear = " + averageYear);
        System.out.println("listOfNames = " + listOfNames);
    }
}

