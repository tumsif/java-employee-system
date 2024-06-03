import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.print("Enter your first number ");
        int firstnumber = userinput.nextInt();
        userinput.nextLine();
        System.out.print("Enter your second number ");
        int secondnumber = userinput.nextInt();
        userinput.nextLine();
        System.out.print("Enter your third number ");
        int thirdnumber = userinput.nextInt();
        userinput.nextLine();

        // store them in an array to access them by iteration
        int[] numbers = { firstnumber, secondnumber, thirdnumber };

        // set smallestnumber to the firstnumber as an initialization
        int smallestnumber = firstnumber;
        for (int i = 0; i < (numbers.length); i++) {
            if (numbers[i] < smallestnumber) {
                smallestnumber = numbers[i];
            }
        }

        System.out.println("The smallest number is " + smallestnumber);
    }
}
