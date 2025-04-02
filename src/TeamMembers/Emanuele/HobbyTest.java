package TeamMembers.Emanuele;

import java.util.ArrayList;
import java.util.Arrays;

public class HobbyTest {

    public static void main(String[] args) {

        Hobby hobby1 = new Hobby("Swimming", 120, true, false);
        Hobby hobby2 = new Hobby("Baseball", 250, true, true);
        Hobby hobby3 = new Hobby("Soccer", 175, true, true);
        Hobby hobby4 = new Hobby("Pool", 175, false, true);

        ArrayList<Hobby> list = new ArrayList<>();
        list.add(hobby1);
        list.add(hobby2);
        list.add(hobby3);
        list.add(hobby4);
        list.add(new Hobby("Golf", 2000, true, false));


        System.out.println("Print Array list");
        System.out.println("---------------------------------------");

        System.out.println("Array list: " + Arrays.asList(list));

        System.out.println("---------------------------------------");
        System.out.println();

        System.out.println("Print hobby name:");
        System.out.println("---------------------------------------");
        for (Hobby hobby : list) {
            System.out.println(hobby.name);
        }


        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("Print method: ");
        System.out.println("---------------------------------------");
        for (Hobby hobby : list) {
            hobby.doIt();
        }

        System.out.println("--------------------------------");
        System.out.println();
        System.out.println("Print Outdoor Hobbies");
        System.out.println("---------------------------------------");
        for (Hobby hobby : list) {
            if (hobby.isOutdoor) {
                System.out.println(hobby);
            }

        }

        System.out.println("----------------------------------");
        System.out.println();
        System.out.println("Print Indoor Hobbies");
        System.out.println("-------------------------------------");
        for (Hobby hobby : list) {
            if (!hobby.isOutdoor) {
                System.out.println(hobby.name);
            }
        }
        System.out.println("-------------------------------------");
        System.out.println();
        System.out.println("Print Hobbies that dont require others");
        System.out.println("----------------------------------------");
        for (Hobby hobby : list) {
            if (!hobby.isRequiredOthers) {
                System.out.println(hobby.name);
            }
        }
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println("Print expensive hobbies");
        System.out.println("-------------------------------------");
        for (Hobby hobby : list) {
            if (hobby.annualCost > 250) {
                System.out.println(hobby.name);
            }
        }

        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println("Print each hobby and cost of each hobby");
        System.out.println("---------------------------------------");
        for (Hobby hobby : list) {
            System.out.println(hobby.name + " " + hobby.annualCost);
        }

        System.out.println("---------------------------------------");


    }
}
