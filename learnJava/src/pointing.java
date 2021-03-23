import java.awt.*;
import java.util.Date;

class Main {
    public static void main(String[] args){

        Point point1 = new Point(1, 1);
        Point point2 = point1;

        byte age = 30;
        // We are using L or F as a suffix to represent the number as a Long or a Float
        long youtubeViews = 3_124_456_78910L; // us _ to make numbers more readable, just like we use a ,

        point1.x = 2;

        System.out.println("hello");
        System.out.println(point2);
    }
}

// Use byte instead of int for small values (-128 to 127)