package TeamMembers.Emanuele;

public class CountryClient {


    public static void main(String[] args) {


        Country country1 = new Country("Turkey", 82.32, "Asian");
        Country country2 = new Country("Italy", 58.99, "Europe");

        //Country Objects
        System.out.println(country1);
        System.out.println(country2);

        //Static Variables
        System.out.println("World Population " + Country.worldPopulation + " million");
        System.out.println("World C02 level " + Country.worldC02Lvl + " ppm");


    }
}
