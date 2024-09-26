package assignment1_200584372;

public class House {

    // Create 3 instance variables with unique data types and unique accessibility levels:
    public String location;
    private String owner;
    public double price;
    public int numberOfBedrooms;

    // Create 7 constructors for this class (including the default constructors):

    // Constructor 1
    public House () {}

    // Constructor 2
    public House (String location, String owner, double price, int numberOfBedrooms) {
        this.location = location;
        this.owner = owner;
        if(price > 0) {
            this.price = price;
        }
        this.numberOfBedrooms = numberOfBedrooms;
    }

    // Constructor 3
    public House (String owner) {
        this.owner = owner;
    }

    // Constructor 4
    public House (double price) {
        if(price > 0) {
            this.price = price;
        }
    }

    // Constructor 5
    public House (int numberOfBedrooms){

        this.numberOfBedrooms = numberOfBedrooms;
    }

    // Constructor 6
    public House (String location, int numberOfBedrooms){
        this.location = location;
        this.numberOfBedrooms = numberOfBedrooms;
    }

    // Constructor 7
    public House (String owner, double price){
        this.owner = owner;
        this.price = price;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner(){

        return owner;
    }

}
