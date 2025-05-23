package TeamMembers.Rasa;

public class Country {

    public static double worldPopulation;
    public static double worldCo2Level;

    public String name;
    public double population;
    public String continent;

    static {
        worldPopulation = 7.88;
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
                ", continent='" + continent + '\'' +
                '}';
    }
}
