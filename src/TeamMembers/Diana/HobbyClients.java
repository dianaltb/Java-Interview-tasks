package TeamMembers.Diana;

import java.util.ArrayList;

public class HobbyClients {
    public static void main(String[] args) {
        //   Create different Hobby objects
        Hobby dancing = new Hobby("dancing");
        dancing.annualCost = 9000;
        dancing.isOutdoor = true;
        dancing.isRequiredOthers = false;
        System.out.println(dancing);
        Hobby javaing = new Hobby("Javaing", 10000);
        javaing.isOutdoor = false;
        javaing.isRequiredOthers = true;
        System.out.println(javaing);
        Hobby playing = new Hobby("Playing", 3000, true, true);
        System.out.println(playing);

        System.out.println("-----------------------");
        // Create an ArrayList of Hobby objects and add already created objects with asList() and also add new hobby objects while creating ArrayList
        //            Add new hobby objects whit add() method
        ArrayList<Hobby> hobbyArrayList = new ArrayList<>();
        hobbyArrayList.add(dancing);
        hobbyArrayList.add(javaing);
        hobbyArrayList.add(playing);
        hobbyArrayList.add(new Hobby("jumping", 900, true, false));

        //  Print all hobbies
        System.out.println(hobbyArrayList);

        System.out.println("------------------------");
        // Execute the doIt() method one by one for hobbies
        dancing.doIt();
        javaing.doIt();
        playing.doIt();
        hobbyArrayList.getLast().doIt();

        System.out.println("-------------------");
        //      Execute the doIt() method for all hobbies with iterating through the ArrayList
        for (Hobby each : hobbyArrayList) {
            each.doIt();
        }
        System.out.println("--------------------");
        //            Print just Indoor Hobbies List
        System.out.println("Indoor hobbies are:");
        for (Hobby each : hobbyArrayList) {
            if (!each.isOutdoor) {
                System.out.println(each.name);
            }
        }

        System.out.println("--------------------");
        //  Print just Play Alone Hobbies List
        System.out.println("Playing alone hobbies are");
        for (Hobby each : hobbyArrayList) {
            if (!each.isRequiredOthers) {
                System.out.println(each.name);
            }
        }

        System.out.println("-------------");
        //  Print just Expensive Hobbies List
        for (Hobby each : hobbyArrayList) {
            if (each.annualCost > 1000) {
                System.out.println(each.name);
            }
        }

        System.out.println("----------");
       //  Print  Hobby a Annual Cost
        for (Hobby each : hobbyArrayList) {
            System.out.println("Annual cost for " + each.name + " is " + each.annualCost);
        }
    }
}
