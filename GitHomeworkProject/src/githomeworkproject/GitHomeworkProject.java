/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package githomeworkproject;

import java.util.Random;

public class GitHomeworkProject {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        Random random = new Random();

        // initialize table with random values
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); // 0–99
        }

        System.out.println("Random table values:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
    }
}

