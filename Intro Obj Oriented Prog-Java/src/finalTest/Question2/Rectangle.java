package finalTest.Question2;

public class Rectangle implements Resizable {


    @Override
    public void resizeWidth(int width) {
        System.out.println("Rectangle width resized");
    }

    @Override
    public void resizeHeight(int height) {
        System.out.println("Rectangle height resized");
    }
}
