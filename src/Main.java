//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int currentYear = 2022;


//        String usersDateOfBirth = "1999";
//
//        int dateOfBirth = Integer.parseInt(usersDateOfBirth);
//        System.out.println("Age = " + (currentYear - dateOfBirth));
//
//        String userAgeWithParitalYear = "18.5";
//
//        double ageWithParitalYear = Double.parseDouble(userAgeWithParitalYear);
//        System.out.println("Age = " + ( ageWithParitalYear));

        System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromCScanner(currentYear));
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, What's your name? ");
        System.out.println("Hi " + name + ", Thank you for using our program!");

        String dateOfBirth = System.console().readLine("What year ware your born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return name + " " + age + " years old";
    }

    public static String getInputFromCScanner(int currentYear) {
        return " ";
    }
}
