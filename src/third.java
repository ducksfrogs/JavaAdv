import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        int currentYear = 2020;

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }

    }

    public static  String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, What's your name? ");
        System.out.println("Hi " + name + ", what are you doing? ");

        String dateOfBirth = System.console().readLine("What's your date? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return  "So you are " + age + " years old.";
    }

    public static  String getInputFromScanner(int currentYear) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hi, What's your name? ");
        String name = sc.nextLine();

        System.out.println("Hi " + name + ", what are you doing? ");

        System.out.println("What's your date? ");
        String dateOfBirth = sc.nextLine();
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return  "So you are " + age + " years old.";

    }
}
