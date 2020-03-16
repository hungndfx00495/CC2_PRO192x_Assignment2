/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Random;

/**
 *
 * @author fx00495
 */

public class Bee {
    private String type;
    private byte health;
    private boolean alive;
    private byte dieValue;

    public Bee() {
        // Initialize health for bee
        this.setHealth((byte) 100);
        alive = true;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public byte getHealth() {
        return health;
    }

    public void setHealth(byte health) {

        // If the health of bee < 0, set it 0
        if (health < 0) {
            health = 0;
        }
        this.health = health;

        // Update alive status when the health value is changed
        if (health < dieValue) {
            alive = false;
        }
    }

    public byte getDieValue() {
        return dieValue;
    }

    public void setDieValue(byte dieValue) {
        this.dieValue = dieValue;
    }

    public boolean isAlive() {
        return this.alive;
    }

    // Attack the bee
    public void damage() {
        // Attacking alive bee
        if (this.isAlive()) {
            byte damage = (byte) new Random().nextInt(101);
            this.health -= damage;
            this.setHealth(this.health);
        }
    }

    @Override
    public String toString() {
        String deadOrAlive;
        if (this.isAlive()) {
            deadOrAlive = "alive";
        } else {
            deadOrAlive = "dead";
        }
        return this.getType() + "\t" + this.getHealth() + "\t" + deadOrAlive;
    }
}
