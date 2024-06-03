import java.util.Scanner;

public class CompareInt {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.print("Enter the first number ");
        int firstinput = userinput.nextInt();
        userinput.nextLine();
        System.out.print("Enter the second number ");
        int secondinput = userinput.nextInt();
        userinput.nextLine();
        if (firstinput > secondinput) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
