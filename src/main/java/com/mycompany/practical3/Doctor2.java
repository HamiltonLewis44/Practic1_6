/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical3;

/**
 *
 * @author andre
 */
class Doctor2 extends Doctor {
    @Override
    public void writeRecipe(String recipeText) {
        String modifiedText = recipeText.toUpperCase(); // Пример модификации текста (перевод в верхний регистр)
        System.out.println("Модифицированный рецепт: " + modifiedText);
    }
}