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

public class QueenBee extends Bee {
    // Initialize Queen bee
    public QueenBee() {
        super();// Call base class (Bee) constructor
        this.setType("Queen");
        this.setDieValue((byte) 20);
    }
}
