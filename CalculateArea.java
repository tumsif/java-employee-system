import java.util.Scanner;

public class CalculateArea {
    public static void main(String[] args) {
        System.out.print("Enter the radius of the circle ");
        Scanner userinput = new Scanner(System.in);
        double radius = userinput.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.println("The area of the circle is " + area);
    }
}