
public class Main {
    public static void main(String[] args) {
        String firstName = "Семён";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        String fullName = lastName + " " + firstName + " " + middleName;
        //fullName = fullName.replace("ё", "е");
        System.out.println("ФИО сотрудника: " + fullName);

        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + upperFullName);

        if(fullName.contains("ё")) {
            fullName = fullName.replace("ё", "е");
            System.out.println("Данные ФИО сотрудника - " +fullName);
        }




    }
}