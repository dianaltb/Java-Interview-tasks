package TeamMembers.Marie;

public class CountryClients {

    public static void main(String[] args) {

    //country objects
    Country country1 = new Country("Tajikistan", 11.00, "Asia");
        System.out.println(country1);

        Country country2 = new Country("USA", 340, "North America");
        System.out.println(country2);

        System.out.println(Country.worldPopulation + " billion");
        System.out.println(Country.co2Level + " ppm");

    }


}
