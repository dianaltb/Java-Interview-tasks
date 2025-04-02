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
// Create an ArrayList of Hobby objects and add already created objects with asList() and also add new hobby objects while creating ArrayList
//            Add new hobby objects whit add() method

        ArrayList<Hobby> hobbyArrayList = new ArrayList<>();
        hobbyArrayList.add(dancing);
        hobbyArrayList.add(javaing);
        hobbyArrayList.add(playing);
        hobbyArrayList.add(new Hobby("jumping", 900, false, true));

//  Print all hobbies
        System.out.println(hobbyArrayList);
// Execute the doIt() method one by one for hobbies
        dancing.doIt();
        javaing.doIt();
        playing.doIt();
        hobbyArrayList.getLast().doIt();
//      Execute the doIt() method for all hobbies with iterating through the ArrayList
        for (Hobby each : hobbyArrayList) {
            each.doIt();
        }
     //            Print just Indoor Hobbies List
        for (Hobby each : hobbyArrayList) {
            if (each.isOutdoor){
                System.out.println(each);
            }
        }

    }


}
