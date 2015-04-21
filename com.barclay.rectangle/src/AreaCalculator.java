import java.awt.*;

/**
 * Created by Junaid on 20-04-2015.
 */
public class AreaCalculator {
    public static void main(String args[]){
        try {
            if (args.length == 0) {
                throw new Exception("Please provide arguments");
            }
            if(args.length==1) {
                Square square = new Square(Integer.parseInt(args[0]));
                int result = square.calculateArea();
                System.out.println("The Area is : " + result);
            }
            else if (args.length==2) {
                Rectangle rectangle = new Rectangle(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
                int result = rectangle.calculateArea();
                System.out.println("The Area is : " + result);
            }
            else {
                throw new Exception("Too many arguments");
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
