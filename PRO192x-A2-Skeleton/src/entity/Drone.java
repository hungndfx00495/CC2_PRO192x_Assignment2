/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author fx00495
 */

public class Drone extends Bee {
    // Initialize Drone
    public Drone() {
        super();// Call base class (Bee) constructor
        this.setType("Drone");
        this.setDieValue((byte) 50);
    }
}
