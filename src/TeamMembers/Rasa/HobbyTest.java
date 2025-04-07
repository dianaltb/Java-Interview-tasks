package TeamMembers.Rasa;

import java.util.ArrayList;

public class HobbyTest {
    public static void main(String[] args) {


        Hobby hobby1 = new Hobby("Rock Climbing", 1200, true, true);

        Hobby hobby2 = new Hobby("Swimming", 600, false, false);

        Hobby hobby3 = new Hobby("Calistenics", 0, true, false);

        ArrayList<Hobby> list = new ArrayList<>();

        list.add(hobby1);
        list.add(hobby2);
        list.add(hobby3);
        list.add(new Hobby("Java", 10_000, false, true));

        System.out.println(hobby1);
        System.out.println(hobby2);
        System.out.println(hobby3);

        System.out.println("-----------");

        hobby1.doIt();
        hobby2.doIt();
        hobby3.doIt();
        list.getLast().doIt();

        System.out.println("-----------");

        for (Hobby hobby : list) {
            hobby.doIt();
        }

        System.out.println("------------");

        System.out.println("Indoor hobbies are: ");
        for (Hobby hobby : list) {
            if (!hobby.isOutdoor) {
                System.out.println(hobby.name);
            }
        }
        System.out.println("-----------------");

        System.out.println("Play Alone hobbies are: ");
        for (Hobby hobby : list) {
            if (!hobby.isRequiredOthers) {
                System.out.println(hobby.name);
            }
        }
        System.out.println("-----------------");

        System.out.println("Expensive hobbies are: ");
        for (Hobby hobby : list) {
            if (hobby.annualCost > 1000)
                System.out.println(hobby.name);
        }
        System.out.println("-----------------");

        for (Hobby hobby : list) {
            System.out.println("Annual cost for " + hobby.name + " is " + hobby.annualCost);
        }


    }


}

