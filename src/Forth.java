import java.util.Scanner;

public class Forth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;
        double sum = 0;

//        while (counter <=5) {
        do {

            System.out.println("Enter number # " + counter + ":");
            String nextNumber = input.nextLine();
            try {
//                int number = Integer.parseInt(nextNumber);
                double number = Double.parseDouble(nextNumber);
                counter++;
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            }
        } while (counter <= 5);

        System.out.println("The sum is " + sum);
    }
}
