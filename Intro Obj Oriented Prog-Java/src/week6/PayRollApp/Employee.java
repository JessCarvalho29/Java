package week6.PayRollApp;

// Adding the abstract key word to define the superclass
public abstract class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract double earnings();

    // Including the notation that this method I want to override
    @Override
    public String toString(){
        return String.format("ID: %d, Name: %s", id, name);
    }


}
