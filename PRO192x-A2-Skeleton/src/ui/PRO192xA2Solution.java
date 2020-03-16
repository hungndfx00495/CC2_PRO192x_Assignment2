/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import business.BeeHive;
import entity.Bee;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fx00495
 */
public class PRO192xA2Solution {

    public static void main(String[] args) {
        BeeHive bh = null;
        boolean keepRunning = true;
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        int choice;
        while (keepRunning) {
            // Show menu
            System.out.println("--------------Bee hive--------------");
            System.out.println("\t1 - Create bee list");
            System.out.println("\t2 - Attack bees");
            System.out.println("\t3 - Exit");
            System.out.print("Enter your choice (1, 2 or 3): ");
            try {
                s.hasNextInt();
                choice = s.nextInt();
                System.out.println("------------------------------------");
                ArrayList<Bee> bees;
                switch (choice) {
                case 1:
                    bh = new BeeHive();
                    bh.init();// Create 10 bees
                    bees = bh.getAllBees();
                    System.out.println("Bees details at the beginning:");
                    showBees(bees);
                    break;
                case 2:
                    if (bh == null) {
                        System.out.println("No bee!");
                    } else {
                        bh.attackBees();// Attach bees
                        bees = bh.getAllBees();
                        System.out.println("Bees details at the moment:");
                        showBees(bees);
                    }
                    break;
                default:
                    keepRunning = false;
                    break;
                }
            } catch (Exception e) {
                System.err.println(
                        "Input wrong, please input number 1 or 2 or 3!");
                s.nextLine();
            }
        }
    }

    /**
     * Print to console the list of all bees
     * 
     * @param bees
     */
    public static void showBees(ArrayList<Bee> bees) {
        int count = 0; // Count bees alive
        for (int i = 0; i < bees.size(); i++) {
            if (i < bees.size() - 1) {
                System.out.println((i + 1) + ")  " + bees.get(i).toString());
            } else {
                System.out.println((i + 1) + ") " + bees.get(i).toString());
            }
            if (bees.get(i).isAlive()) {
                count++;
            }
        }

        // If all bees are death, print All bees are dead!
        if (count == 0) {
            System.err.println("\n\tAll bees are dead!\n");
        }
    }
}
