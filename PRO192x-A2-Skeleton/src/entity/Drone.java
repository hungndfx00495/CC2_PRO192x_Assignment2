/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author fx00495_
 */

public class Drone extends Bee {
    // Initialize Drone
    public Drone() {
        super();// call base class (Bee) constructor
        this.setType("Drone");
        this.setDeadHealth((byte) 50);
    }

}
