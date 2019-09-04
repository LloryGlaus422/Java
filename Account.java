/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author sugallo_sd2023
 */
public class Account {

    public static void display(Iterator itr) {
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public void printchoice() {
        System.out.println("\nPress 1: List"
                + "\nPress 2: Queue\nPress 3: Set"
                + "\nPress 4: Exit");
        System.out.print("input number: ");
    }

    public void choose() {
        boolean exit = false;
        while (true) {
            if (exit == true) {
                break;
            }
            printchoice();
            Scanner input = new Scanner(System.in);
            String chosen = input.nextLine();
            switch (chosen.trim()) {
                case "1":
                    list();
                    break;
                case "2":
                    queue();
                    break;
                case "3":
                    set();
                    break;
                case "4":
                    exit = true;
                    System.out.println("Thank You!");
                    break;
            }

        }
    }

    public static void main(String args[]) {
        Account a = new Account();
        a.choose();
    }

    public static void list() {
        Scanner input = new Scanner(System.in);
        System.out.println("ArrayList*************************************\n");
        ArrayList<String> s1 = new ArrayList();
        System.out.println("Provide Necessary Information:");
        System.out.println("Input Name");
        String name1 = input.nextLine();
        s1.add(name1);
        System.out.println("Input Next Name");
        String name2 = input.nextLine();
        s1.add(name2);
        System.out.println("\nInside Your ArrayLIst");
        display(s1.iterator());
        System.out.println("\nDo you want to Make changes");
        System.out.println("\nChoose Action: \nPress 1: Remove"
                + "\nPress 2: Update " + "\nPress 3 : No");
        System.out.println("Input Number: ");
        String num = input.nextLine();
        switch (num.trim()) {
            case "1":
                System.out.println("\nYour List");
                display(s1.iterator());
                s1.clear();
                System.out.println("\nMade Change");
                display(s1.iterator());
                break;
            case "2":
                System.out.println("\nYour List");
                display(s1.iterator());
                System.out.println("Input Index");
                int result = Integer.parseInt(input.nextLine());
                System.out.println("what to change: ");
                String word = input.nextLine();
                s1.set(result, word);
                System.out.println("\nChanges made:");
                display(s1.iterator());
                break;
            case "3":
                System.out.println("Made No Changes");
                display(s1.iterator());
        }

    }

    public static void queue() {
        Scanner input = new Scanner(System.in);
        System.out.println("PriorityQueue*************************************");
        PriorityQueue<String> p1 = new PriorityQueue();
        System.out.println("Input Name");
        String name3 = input.nextLine();
        p1.add(name3);
        System.out.println("Input Name2");
        String name4 = input.nextLine();
        p1.add(name4);
        display(p1.iterator());
        System.out.println("Do you want to Make changes");
        System.out.println("\nChoose Action: \nPress 1: Remove"
                + "\nPress 2: Update " + "\nPress 3 : No");
        String num1 = input.nextLine();
        switch (num1.trim()) {
            case "1":
                System.out.println("Your List");
                display(p1.iterator());
                p1.poll();
                System.out.println("Made Change");
                display(p1.iterator());
                break;
            case "2":
                System.out.println("\nYour List");
                display(p1.iterator());
                System.out.println("Add Name");
                String a = input.nextLine();
                if (!p1.isEmpty()) {
                    p1.add(a);
                }
                System.out.println("\nChanges made:");
                display(p1.iterator());
                break;
            case "3":
                display(p1.iterator());
        }
    }

    public static void set() {
        Scanner input = new Scanner(System.in);
        Set<String> h1 = new HashSet<>();
        System.out.println("HashSet*************************************\n");
        System.out.println("Provide Necessary Information:");
        System.out.println("Input Name");
        String name5 = input.nextLine();
        h1.add(name5);
        System.out.println("Course and Year");
        String name6 = input.nextLine();
        h1.add(name6);
        System.out.println("\nInside Your ArrayLIst");
        display(h1.iterator());
        System.out.println("\nDo you want to Make changes");
        System.out.println("\nChoose Action: \nPress 1: Remove"
                + "\nPress 2: Update " + "\nPress 3 : No");
        System.out.println("Input Number: ");
        String num3 = input.nextLine();
        switch (num3.trim()) {
            case "1":
                System.out.println("\nYour List");
                display(h1.iterator());
                h1.clear();
                System.out.println("\nMade Change");
                display(h1.iterator());
                break;
            case "2":
                System.out.println("\nYour List");
                display(h1.iterator());
                System.out.println("what to change: ");
                String word = input.nextLine();
                h1.add(word);
                System.out.println("\nChanges made:");
                display(h1.iterator());
                break;
            case "3":
                System.out.println("Made No Changes");
                display(h1.iterator());
        }
    }
}
