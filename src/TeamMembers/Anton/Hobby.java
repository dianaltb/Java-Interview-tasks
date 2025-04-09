package TeamMembers.Anton;

public class Hobby {
    public String name;
    public double annualCost;
    public boolean isOutDoor;
    public boolean isRequiredOfOthers;

    public Hobby(String name){
        this.name = name;
    }


    public Hobby(String name, double annualCost){
        this(name);
        this.annualCost = annualCost;
    }

    public Hobby(String name, double annualCost, boolean isOutDoor, boolean isRequiredOfOthers){
        this(name, annualCost);
        this.isOutDoor = isOutDoor;
        this.isRequiredOfOthers = isRequiredOfOthers;
    }

    public void doIt (){
        System.out.println("Doing " + name + " as an "  + (isOutDoor? "outdoor " : "indoor ") + "hobby.");

    }

    @Override
    public String toString() {
        return "Hobby: {" +
                "name='" + name + '\'' +
                ", annualCost=" + annualCost +
                ", isOutDoor=" + isOutDoor +
                ", isRequiredOfOthers=" + isRequiredOfOthers +
                '}';
    }
}
