import java.awt.*;

/**
 * Created by Junaid on 20-04-2015.
 */
public class RectangleCalculator {
    public static void main(String args[]) {
        Rectangle rectangle = new Rectangle(6,4);
        int result = rectangle.calculateArea();
        System.out.println("The Area is : "+ result);
    }
}
