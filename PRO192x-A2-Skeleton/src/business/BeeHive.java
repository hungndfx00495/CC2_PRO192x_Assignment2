/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import entity.QueenBee;
import entity.Bee;
import entity.WorkerBee;
import entity.Drone;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author fx00495_
 */
public class BeeHive {
    private ArrayList<Bee> listBee;

    public void init() {
        // Create list of 10 bees with 3 types such as Queen bee, Worker bee and
        // Drone, it gives 100 health for each bee
        this.listBee = new ArrayList<>();
        Random rd = new Random();
        byte countQueen = 0;
        byte countBee = 0;
        // Add bees in the hive
        while (countBee < 10) {
            // Random 3 types of bee
            int randomBee = rd.nextInt(3);
            switch (randomBee) {
            case 0:
                // If queen is created, just skip it.
                if (countQueen == 1) {
                    break;
                } else {
                    listBee.add(new QueenBee());
                    countQueen++;
                    countBee++;
                    break;
                }
            case 1:
                // Add drone into the hive
                listBee.add(new Drone());
                countBee++;
                break;
            case 2:
                // Add worker bee into the hive
                listBee.add(new WorkerBee());
                countBee++;
                break;
            }
        }
    }

    // Get all bees in the hive
    public ArrayList<Bee> getAllBees() {
        return listBee;
    }

    // Attach all bees
    public void attackBees() {
        for (int i = 0; i < listBee.size(); i++) {
            this.listBee.get(i).damage();
        }
    }
}
