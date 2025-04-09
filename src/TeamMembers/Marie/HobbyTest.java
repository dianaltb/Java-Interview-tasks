package TeamMembers.Marie;

import java.util.ArrayList;
import java.util.Arrays;

public class HobbyTest {

    public static void main(String[] args) {

        // Create different Hobby objects
        Hobby hobby1 = new Hobby("Java", 900, false, true);
        System.out.println(hobby1);
        Hobby hobby2 = new Hobby("AerialYoga", 600, true, false);
        System.out.println(hobby2);

        // Create an ArrayList of Hobby objects and add already created objects with asList() and also add new hobby objects while creating ArrayList
        ArrayList<Hobby> hobbies = new ArrayList<>(Arrays.asList(hobby1, hobby2));

        // Add new hobby objects whit add() method
        System.out.println("=========================================================================");
        hobbies.add(new Hobby("Chess", 600, false, true));
        hobbies.add(new Hobby("Music", 700, false, true));

        //  Print all hobbies
        System.out.println("All hobbies:" + hobbies);

        //Execute the doIt() method one by one for hobbies
        System.out.println("=========================================================================");
        for (Hobby each : hobbies) {
            each.doIt();

        }

        //  Print just Indoor Hobbies List
        System.out.println("=========================================================================");
        for (Hobby each : hobbies) {
            if (!each.isOutdoor) {

            }

                }
            //Print just Play Alone Hobbies List
        System.out.println("=========================================================================");
            for (Hobby h : hobbies) {
                if (!h.isRequiredOthers) {
                    System.out.println("Hobbies which can be used alone is " + h.name);

            }
        }

            //  Print just Expensive Hobbies List
        System.out.println("=========================================================================");
        for(Hobby each : hobbies){
            if (each.annualCost > 600){
                System.out.println("The most expensive hobbies is " + each.name + " which is cost $" + each.annualCost);
            }
        }

        //Print  Hobby an Annual Cost
        System.out.println("=========================================================================");
        for (Hobby each : hobbies){
            System.out.println(each.name + "s annual cost is $" + each.annualCost );
        }
    }
}
/*
Create a class "HobbyTest" to test the Hobby objects and static variables
            Create different Hobby objects
            Create an ArrayList of Hobby objects and add already created objects with asList() and also add new hobby objects while creating ArrayList
            Add new hobby objects whit add() method
            Print all hobbies
            Execute the doIt() method one by one for hobbies
            Execute the doIt() method for all hobbies with iterating through the ArrayList
            Print just Indoor Hobbies List
            Print just Play Alone Hobbies List
            Print just Expensive Hobbies List
            Print  Hobby an Annual Cost
 */