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

        boolean vaildDOB = false;
        int age = 0;

        do{
            System.out.println("Enter a year of birth: " + (currentYear - 125 ) + " and <= " + currentYear);
            try {
                age = checkData(currentYear, sc.nextLine());
                vaildDOB = age < 0 ? false : true;
            } catch (NumberFormatException badUserData){
                System.out.println("Invalid input. Try again.");
            }

//            String dateOfBirth = sc.nextLine();
//            age = currentYear - Integer.parseInt(dateOfBirth);
        } while (!vaildDOB);


        return  "So you are " + age + " years old.";
    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if ((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }
        return (currentYear - dob);
    }
}
