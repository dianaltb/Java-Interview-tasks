package TeamMembers.Marie;

public class Country {

    //Define these static variables:
    public static double worldPopulation;
    public static double co2Level;

    // Define these instance variables:
    String name;
    double population;
    String continent;

    // Create a static block to initialize the static variables with these values:
    static {
        worldPopulation = 7.88;
        co2Level = 417.83;

    }

    //Create a constructor to initialize the instance variables


    public Country(String name, double population, String continent) {
        this.name = name;
        this.population = population;
        this.continent = continent;
    }

    //Create  toString() method to return all the instance variables


    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", continent='" + continent + '\'' +
                '}';
    }
}
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
            Create a static block to initialize the static variables with these values:
                world population - 7.88 billion
                world co2 level - 417.83 ppm (parts per million)
            Create a constructor to initialize the instance variables
            Create  toString() method to return all the instance variables

         Create a class "CountryTest" to test the Country objects and static variables

 */