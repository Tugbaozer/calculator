import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        double x, y;
        int select;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        x = input.nextInt();
        System.out.print("Enter the second number :");
        y = input.nextInt();

        System.out.println("1- Addition\n2- Subtraction\n3- Multiplication\n4- Division");
        System.out.println("Your choice : ");

        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Total :" + (x + y));
                break;

            case 2:
                System.out.println("Subtraction :" + (x - y));
                break;

            case 3:
                System.out.println("Multiplication : " + (x * y));
                break;

            case 4:
                if (y == 0)
                    System.out.println("You cannot divide by 0. ");
                else
                    System.out.println("Division : " + (x / y));
                break;

            default:
                System.out.println("You made the wrong choice. ");


        }

    }
}