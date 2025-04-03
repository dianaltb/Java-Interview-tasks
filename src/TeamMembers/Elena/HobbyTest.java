package TeamMembers.Elena;

import java.util.ArrayList;

public class HobbyTest {

    public static void main(String[] args) {
        Hobby guitar = new Hobby("playing guitar");

        Hobby cooking = new Hobby("cooking", 200);

        Hobby singing = new Hobby("singing", 1200, false, false);

        ArrayList<Hobby> listHobbies = new ArrayList<>();
        listHobbies.add(guitar);
        listHobbies.add(cooking);
        listHobbies.add(singing);
        listHobbies.add(new Hobby("pickle ball ", 200, true, true));

        System.out.println(listHobbies);

        guitar.doIt();
        cooking.doIt();
        singing.doIt();

        System.out.println("------------------------------------------");

        for (Hobby each : listHobbies) {
            each.doIt();
        }

        System.out.println("-----------------------------------------");

        for (Hobby each : listHobbies) {
            if (each.annualCost > 1000) {
                System.out.println(each.name + " is the most expensive hobby.It is " + each.annualCost + " $ annually.");
            }
        }
        System.out.println("------------------------");
        for (Hobby each : listHobbies) {
            if (!each.isRequiedOthers) {
                System.out.println(each.name + " doesn't require other people.");
            }
        }
        System.out.println("-----------------------------");
        for (Hobby each : listHobbies) {
            if (!each.isOutdoor) {
                System.out.println(each.name + " is an indoor hobby");
            }
        }
        System.out.println("--------------------------------");
        for (Hobby each : listHobbies) {
            if (each.annualCost == 0) {
                System.out.println("The annual cost for a " + each.name + " hobby is free ");
            } else {
                System.out.println("The annual cost for a " + each.name + " hobby is " + each.annualCost+ " $");
            }

        }
    }
}