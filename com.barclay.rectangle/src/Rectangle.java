/**
 * Created by Junaid on 20-04-2015.
 */
public class Rectangle {
    private int length;
    private int height;

    public Rectangle(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public int calculateArea() {
        return length*height;
    }
}
