public class third {
    public static void main(String[] args) {
        int currentYear = 2020;

        System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));

    }

    public static  String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, What's your name? ");
        System.out.println("Hi " + name + ", what are you doing? ");

        String dateOfBirth = System.console().readLine("What's your date? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return  "So you are " + age + " years old.";
    }

    public static  String getInputFromScanner(int currentYear) {

        return null;
    }
}
