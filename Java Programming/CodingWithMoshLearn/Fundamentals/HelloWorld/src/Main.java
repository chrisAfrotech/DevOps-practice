import java.awt.*;
import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        //primitives types used to store simple value such as (numbers cahracters and booleans)
//       byte age = 30;
//       long viewsCount = 123_456_789_958l;
//       float price = 10.99f;
//       char letter = 'A';
//       boolean isEligible = false;

       //References types to store complex object such as(data, mail message)
        // when crating reference type you need to allocate memory
//        Date now = new Date();
//        System.out.println(now);
//
//        byte x = 1;
//        byte y = x;
//        x=2;
//        System.out.println(y);
//        Point point1 = new Point(1, 1);
//        Point point2 = point1;
//        point1.x= 2;
//        System.out.println(point2);
        //parameters are the holds we define in a method while arguments are value we pass to that method.

        String message = " File located in c:\tlinux\\...      Hello \"christophe\" " + "!!           ";
//        System.out.println(message.startsWith("!!"));
        System.out.println(message.replace("!", "*"));
        System.out.println(message);
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());

    }
}