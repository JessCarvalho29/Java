package finalTest.Question1;

public abstract class House {

    private final String type;
    private final int constructionYear;
    private final double totalConstructedSpace;
    private final int numberOfBedrooms;
    private final int numberOfBathrooms;

    public House(String type, int constructionYear, double totalConstructedSpace, int numberOfBedrooms, int numberOfBathrooms) {
        this.type = type;
        this.constructionYear = constructionYear;
        this.totalConstructedSpace = totalConstructedSpace;
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public abstract double CalculateCurrentValue();
}
