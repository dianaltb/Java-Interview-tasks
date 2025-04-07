package TeamMembers.Elena;

public class Hobby {

    public String name;
    public int annualCost;
    public boolean isOutdoor;
    public  boolean isRequiedOthers;

    public Hobby(String name) {
        this.name = name;
    }

    public Hobby(String name, int annualCost) {
        this(name);
        this.annualCost = annualCost;
    }

    public Hobby(String name, int annualCost, boolean isOutdoor, boolean isRequiedOthers) {
        this(name, annualCost);
        this.isOutdoor = isOutdoor;
        this.isRequiedOthers = isRequiedOthers;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", annualCost=" + annualCost +
                ", isOutdoor=" + isOutdoor +
                ", isRequiedOthers=" + isRequiedOthers +
                '}';
    }

    public void doIt(){
        if(isOutdoor) {
            System.out.println("Doing " + name + " as an outdoor hobby");
        }else{
            System.out.println("Doing " + name + " as an indoor hobby");
        }


    }

}
