package teamMembers.anton;

import teamMembers.rasa.Country;

public class CountryTest {

        public static void main(String[] args) {


            teamMembers.rasa.Country country1 = new teamMembers.rasa.Country("Ukraine", 37.73, "Europe");

            System.out.println(country1);

            System.out.println(Country.worldPopulation + "B (billions)");
            System.out.println(Country.worldCo2Level + "ppm (parts per million)");
        }
    }


