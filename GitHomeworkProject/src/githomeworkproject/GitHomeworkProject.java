/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package githomeworkproject;

import java.util.Arrays;
import java.util.Random;

public class GitHomeworkProject {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        Random random = new Random();

        // initialize with random values
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Before sort:");
        System.out.println(Arrays.toString(numbers));

        // sort
        Arrays.sort(numbers);

        System.out.println("After sort:");
        System.out.println(Arrays.toString(numbers));
        System.out.println("Revert test line");
    }
}

