package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// Задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' '+ firstName + ' ' + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

    // Задание 2
    String fullNameForReport = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameForReport);

    //Задание 3
        String fullName3 = "Иванов Семён Семёнович";
        fullName3 = fullName3.replace("ё","е" );
        System.out.println("Данные ФИО сотрудника — " + fullName3);


    }

}
