package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String name;
        Scanner in = new Scanner(System.in);

        System.out.println("Iveskite varda");
        name = in.nextLine();

        for (int i = 0; i < 5; i ++){
            System.out.println(name);
        }
    }
}
