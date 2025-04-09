package TeamMembers.Anton;

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

    public static double getWorldPopulation() {
        return worldPopulation;
    }

    public static double getWorldCo2Level() {
        return worldCo2Level;
    }

    public Country(String name, double population, String continent) {
        this.name = name;
        this.population = population;
        this.continent = continent;
    }


    @Override
    public String toString() {
        return "Country: {" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", continent='" + continent + '\'' +
                '}';
    }
}
