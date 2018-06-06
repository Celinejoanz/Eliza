package com.company;

import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random generate = new Random();

        String[] qualifier = {"Why do you say that ", "You seem to think that ", "So, you are concerned that "};
        String[] hedges = {"Please tell me more ", "Many of my patients tell me the same thing ", "It is getting late, maybe we had better quit "};
        String output = "";
        boolean quit = false;
        System.out.println("How are you feeling?");
        String input = scan.nextLine();

        //prompt for more questions
        do {
            // move it outside the loop


            String[] a = input.split(" ");
            for (int i = 0; i < a.length; i++) {
                if (a[i].equalsIgnoreCase("me") || a[i].equalsIgnoreCase("i")) {
                    a[i] = "you";
                } else if (a[i].equalsIgnoreCase("my")) {
                    a[i] = "your";
                } else if (a[i].equalsIgnoreCase("am")) {
                    a[i] = "are";
                }
                output += a[i] + " ";
            }

            int qualiferIndex = generate.nextInt(qualifier.length);
            int hedgeIndex = generate.nextInt(hedges.length);

            String q = qualifier[qualiferIndex] +output + "?" ;
            String h = hedges[hedgeIndex];
            String[] m = {q, h};


            System.out.println(m[generate.nextInt(m.length)]);

            System.out.println("Enter your response here or Q to quit");
            // use same name as the initial variable
            input = scan.nextLine();
            if (input.equalsIgnoreCase("q")) {
                quit = true;
            }
            output = "";
        } while (quit == false);

    }
}

