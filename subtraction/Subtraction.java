
package com.mycompany.subtraction;


import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        // Generate two integers
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);

        // Make sure that num1 >= num2
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Ask the student to give an answer
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is " + num1 + " - " + num2 + "? ");
        int answer = scanner.nextInt();

        // Check the student's answer
        int correctAnswer = num1 - num2;
        if (answer == correctAnswer) {
            System.out.println("Correct answer!");
        } else {
            System.out.println("Wrong, the correct answer is " + correctAnswer);
        }
    }
}
