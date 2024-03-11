package com.mycompany.practical3;

import java.util.Scanner;

import java.util.Scanner;

public class Practical3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос пользователю выбрать вариант дочернего класса
        System.out.println("Выберите вариант дочернего класса (1 или 2): ");
        int choice = scanner.nextInt();

        Doctor doctor;
        if (choice == 1) {
            doctor = new Doctor1();
        } else if (choice == 2) {
            doctor = new Doctor2();
        } else {
            System.out.println("Некорректный выбор");
            doctor = new Doctor();
        }

        // Запрос текста рецепта у пользователя
        System.out.println("Введите текст рецепта: ");
        scanner.nextLine();  // очистка буфера
        String recipeText = scanner.nextLine();

        // Вызов метода writeRecipe в выбранном дочернем классе
        doctor.writeRecipe(recipeText);

        scanner.close();
    }
}