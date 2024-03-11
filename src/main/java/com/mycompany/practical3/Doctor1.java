package com.mycompany.practical3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andre
 */
class Doctor1 extends Doctor {
    @Override
    public void writeRecipe(String recipeText) {
        String reversedText = new StringBuilder(recipeText).reverse().toString();
        System.out.println("Перевернутый рецепт: " + reversedText);
    }
}



