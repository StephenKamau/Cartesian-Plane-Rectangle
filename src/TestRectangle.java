import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {

        //point A
        float x1 = 1, y1 = 1;

        //point B
        float x2 = 1, y2 = 4;

        //point C
        float x3 = 5, y3 = 4;

        //point D
        float x4 = 5, y4 = 1;

        /** Enable in order to enter the values
         Scanner input = new Scanner(System.in);
         System.out.println("Point A: ");
         System.out.print("Enter x: ");
         x1 = input.nextFloat();
         System.out.print("Enter y: ");
         y1 = input.nextFloat();

         System.out.println();

         System.out.println("Point B: ");
         System.out.print("Enter x: ");
         x2 = input.nextFloat();
         System.out.print("Enter y: ");
         y2 = input.nextFloat();

         System.out.println();

         System.out.println("Point C: ");
         System.out.print("Enter x: ");
         x3 = input.nextFloat();
         System.out.print("Enter y: ");
         y3 = input.nextFloat();

         System.out.println();

         System.out.println("Point D: ");
         System.out.print("Enter x: ");
         x4 = input.nextFloat();
         System.out.print("Enter y: ");
         y4 = input.nextFloat();**/

        Rectangle rectangle1 = new Rectangle(x1, y1, x2, y2, x3, y3, x4, y4);
        float area = rectangle1.area();
        float perimeter = rectangle1.perimeter();
        boolean isSquare = rectangle1.isSquare();
        float length = rectangle1.calculateLength(x1, y1, x4, y4);
        float width = rectangle1.calculateWidth(x1, y1, x2, y2);
        System.out.println("Length: " + length + "\nWidth: " + width);
        System.out.println("Area: " + area + "\nPerimeter: " + perimeter + "\nSquare? " + isSquare);
    }
}
