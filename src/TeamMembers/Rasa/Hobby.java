package TeamMembers.Rasa;

public class Hobby {
    public String name;
    public double annualCost;
    public boolean isOutdoor;
    public boolean isRequiredOthers;

    public Hobby(String name) {
        this.name = name;
    }

    public Hobby(String name, double annualCost) {
        this(name);
        this.annualCost = annualCost;
    }

    public Hobby(String name, double annualCost, boolean isOutdoor, boolean isRequiredOthers) {
        this(name,annualCost);
        this.isOutdoor = isOutdoor;
        this.isRequiredOthers = isRequiredOthers;
    }

    public void doIt() {
        if(isOutdoor) {
            System.out.println("Doing " + name + " as an outdoor hobby");
        }else{
            System.out.println("Doing " + name + " as an indoor hobby");
        }
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", annualCost=" + annualCost +
                ", isOutdoor=" + isOutdoor +
                ", isRequiredOthers=" + isRequiredOthers +
                '}';
    }
}
