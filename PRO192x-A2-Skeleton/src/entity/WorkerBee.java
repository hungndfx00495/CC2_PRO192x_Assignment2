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

public class WorkerBee extends Bee {
    // Initialize worker bee
    public WorkerBee() {
        super();// call base class (Bee) constructor
        this.setType("Worker");
        this.setDieValue((byte) 70);
    }
}
