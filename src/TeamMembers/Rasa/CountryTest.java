package TeamMembers.Rasa;

public class CountryTest {
    public static void main(String[] args) {


        Country country1 = new Country("Serbia", 6.77, "Europe");

        System.out.println(country1);

        System.out.println(Country.worldPopulation + " billion");
        System.out.println(Country.worldCo2Level + " ppm");

    }
}
