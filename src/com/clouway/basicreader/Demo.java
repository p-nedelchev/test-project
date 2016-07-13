package com.clouway.basicreader;

import java.util.Scanner;

/**
 * @author Petar Nedelchev (peter.krasimirov@gmail.com)
 */
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.next();
        System.out.println("Your name is " + name);
        int [] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
}
