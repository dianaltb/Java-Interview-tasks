package TeamMembers.Diana;

public class Hobby {
    public String name;
    public int annualCost;
    public boolean isOutdoor;
    public boolean isRequiredOthers;

    public Hobby(String name) {
        this.name = name;
    }

    public Hobby(String name, int annualCost) {
       this(name);
        this.annualCost = annualCost;
    }

    public Hobby(String name, int annualCost, boolean isOutdoor, boolean isRequiredOthers) {
       this(name, annualCost);
        this.isOutdoor = isOutdoor;
        this.isRequiredOthers = isRequiredOthers;
    }

public void doIt(){
    System.out.println("Doing "+name+" as an outdoor/indoor hobby ");
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
/*
  2.Hobby Task
        Create a class called Hobby
            Define these instance variables:
                name
                annualCost
                isOutdoor (boolean)
                isRequiredOthers (boolean)
            Create these overloaded constructors to initialize all the instance variables:
                name,
                name, annualCost
                name, annualCost, isOutdoor, isRequiredOthers

            Create these methods:
                doIt():
                    print: Doing "name" as an outdoor/indoor hobby
                toString()
                    return all the Hobby information

        Create a class "HobbyTest" to test the Hobby objects and static variables
            Create different Hobby objects
            Create an ArrayList of Hobby objects and add already created objects with asList() and also add new hobby objects while creating ArrayList
            Add new hobby objects whit add() method
            Print all hobbies
            Execute the doIt() method one by one for hobbies
          =  Execute the doIt() method for all hobbies with iterating through the ArrayList
          -  Print just Indoor Hobbies List
         -   Print just Play Alone Hobbies List
            Print just Expensive Hobbies List
            Print  Hobby an Annual Cost
 */