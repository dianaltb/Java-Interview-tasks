package TeamMembers.Elena;

public class CountryTest {
    public static void main(String[] args) {

        System.out.println(Country.worldPopulation +" billion");
        System.out.println(Country.worldCo2Level+ "ppm");



        Country country1 = new Country("Ukraine", 37.73,"Europe");
        System.out.println(country1);

        Country country2 = new Country("Japan", 124.5, "Asia" );
        System.out.println(country2);

        Country country3 = new Country("Australia", 26.66,"Australia");
        System.out.println(country3);

    }
}
