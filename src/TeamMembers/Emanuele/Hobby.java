package TeamMembers.Emanuele;

public class Hobby {

    public String name;
    public double annualCost;
    public boolean isOutdoor;
    public boolean isRequiredOthers;


    public Hobby(String name) {
        this.name = name;
    }

    public Hobby(String name, double annualCost) {
        this.name = name;
        this.annualCost = annualCost;
    }

    public Hobby(String name, double annualCost, boolean isOutdoor, boolean isRequiredOthers) {
        this.name = name;
        this.annualCost = annualCost;
        this.isOutdoor = isOutdoor;
        this.isRequiredOthers = isRequiredOthers;
    }



       public void doIt(){
            System.out.println("Doing " + name + " as an outdoor/indoor hobby.");
        }


    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", annualCost=" + annualCost +
                ", isOutdoor=" + isOutdoor +
                ", isRequiredOthers=" + isRequiredOthers +
                '}';
    }
}

