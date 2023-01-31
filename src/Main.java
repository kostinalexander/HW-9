public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
    }


    public static void Task1(){
        System.out.println("Задание1");
        String firstName = " Ivan ";
        String middleName = " Ivanovich ";
        String lastName = " Ivanov ";
        String fullName = lastName+ firstName+ middleName;
        System.out.println("ФИОН сотрудника- " +fullName);
    }


    public static void Task2(){
        System.out.println("Задание2");
        String firstName = " Ivan ";
        String middleName = " Ivanovich ";
        String lastName = " Ivanov ";
        String fullName = lastName+ firstName+ middleName;
        System.out.println("ФИО сотрудника- "+ fullName.toUpperCase());
    }

    public static void Task3() {
        System.out.println("Задание3");
        String firstName = " Семён ";
        String middleName = " Семёнович ";
        String lastName = " Иванов ";
        String fullName = lastName+ firstName+ middleName;
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника- "+ fullName);
    }
}