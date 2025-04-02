package TeamMembers.Diana;

public class Country {
    public static double worldPopulation;
    public static double worldCo2Level;
    public String name;
    public double population;
    public String continent;

    static {
        worldPopulation = 7.8;
        worldCo2Level = 417.83;
    }

    public Country(String name, double population, String continent) {
        this.name = name;
        this.population = population;
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", located on continent='" + continent + '\'' +
                ", world population= '"+worldPopulation+
                ", world CO2 level+ "+ worldCo2Level+
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
            Create a static block to initialize the static variables with theses values:
                world population - 7.88 billion
                world co2 level - 417.83 ppm (parts per million)
            Create a constructor to initialize the instance variables
            Create  toString() method to return all the instance variables

         Create a class "CountryTest" to test the Country objects and static variables


 */