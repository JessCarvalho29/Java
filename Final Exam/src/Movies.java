public class Movies {

    // Creating the variables
    String name;
    double rating;

    // Creating the constructor
    public Movies(String name, double rating){
        this.name = name;
        this.rating = rating;
    }

    // Creating setter methods
    public void setName(String name){
        this.name = name;
    }
    public void setRating(double rating){
        this.rating = rating;
    }

    // Creating getter methods
    public String getName(){
        return name;
    }
    public double getRating() {
        return rating;
    }
}
