public class secondInput {
    public static void main(String[] args) {
        String currentYear = "2020";
        String userDateOfBirth = "1999";
        int currentYearInt = Integer.parseInt(currentYear);
        int userDateOfBirthInt = Integer.parseInt(userDateOfBirth);

        System.out.println("Age: " +  (userDateOfBirth + currentYear));
        System.out.println("Age: " +  (userDateOfBirthInt - currentYearInt));

        String userAgeWithParrtialYear = "22.5";
        double userAgeWithParrtialYearDouble = Double.parseDouble(userAgeWithParrtialYear);

        System.out.println("Age: " + userAgeWithParrtialYearDouble);
    }
}
