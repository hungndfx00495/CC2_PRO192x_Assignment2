/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Random;

/**
 *
 * @author fx00495_
 */
public class Bee {
    private String type;
    private byte health;
    private boolean alive;
    private byte deadHealth; // set dead health

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
        if (health <= 0) {
            health = 0;
        }
        this.health = health;
        // Update alive status when the health value is changed
        if (health < deadHealth) {
            alive = false;
        }
    }

    public byte getDeadHealth() {
        return deadHealth;
    }

    public void setDeadHealth(byte deadHealth) {
        this.deadHealth = deadHealth;
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
        // your code
        String deadOrAlive = "dead";
        if (this.isAlive())
            deadOrAlive = "alive";
        return this.getType() + "\t" + this.getHealth() + "\t" + deadOrAlive;
    }
}
