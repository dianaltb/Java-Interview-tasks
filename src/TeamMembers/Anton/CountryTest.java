package TeamMembers.Anton;

import TeamMembers.Rasa.Country;

public class MyCountry {

        public static void main(String[] args) {


            TeamMembers.Rasa.Country country1 = new TeamMembers.Rasa.Country("Ukraine", 37.73, "Europe");

            System.out.println(country1);

            System.out.println(Country.worldPopulation + "B (billions)");
            System.out.println(Country.worldCo2Level + "ppm (parts per million)");
        }
    }


