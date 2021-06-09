import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width : ");
        double width = scanner.nextDouble();
        System.out.println("Enter the height : ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Your rectangle \n" + rectangle.Display());
        System.out.println("The area of Rectangle is : " + rectangle.getArea());
        System.out.println("the perimeter of rectangle is :  " + rectangle.getPerimeter());
    }
}
