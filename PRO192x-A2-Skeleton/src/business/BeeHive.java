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
 * @author hp
 */
public class BeeHive {
    private ArrayList<Bee> listBee;

    public void init() {
        // create list of 10 bees of Queen, Drone and Worker types
        // in each bee, type and health attributes are randomly chosen
        this.listBee = new ArrayList<>();
        Random rd = new Random();
        byte countQueen = 0;
        byte countBee = 0;
        // your code
        while (countBee < 10) {
            int randomBee = rd.nextInt(3); // Random from 0 to 2;
            switch (randomBee) {
            case 0:
                if (countQueen == 1)
                    break; // Queen have one, don't add, break;
                listBee.add(new QueenBee());
                countQueen++;
                countBee++;
                break;
            case 1:
                listBee.add(new Drone());
                countBee++;
                break;
            case 2:
                listBee.add(new WorkerBee());
                countBee++;
                break;
            }
        }
    }

    public ArrayList<Bee> getAllBees() {
        return listBee;
    }

    // attach all bees
    public void attackBees() {
        // your code
        for (int i = 0; i < listBee.size(); i++) {
            this.listBee.get(i).damage();
        }

    }
}
