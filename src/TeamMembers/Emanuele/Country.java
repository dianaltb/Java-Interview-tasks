package TeamMembers.Emanuele;

public class Country {

    /*
     1.Country Task
        Create a class "Country"
            Define these static variables:
                double world population
                double world co2 level
            Define these instance variables:
                name
                population
                continent
            Create a static block to initialize the static variables with theses values:
                world population - 7.88 billion
                world co2 level - 417.83 ppm (parts per million)
            Create a constructor to initialize the instance variables
            Create  toString() method to return all the instance variables

         Create a class "CountryTest" to test the Country objects and static variables


     */

    public static double worldPopulation;
    public static double worldC02Lvl;
    public String name;
    public double population;
    public String continent;



    static{
        worldPopulation = 7.88;
        worldC02Lvl = 427;
    }

    public Country(String name, double population, String continent) {
        this.name = name;
        this.population = population;
        this.continent = continent;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", continent='" + continent + '\'' +
                '}';
    }
}
