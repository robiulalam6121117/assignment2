/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author Hp
 */
public class SOng {
    private String track;
    private SOng next;

    public SOng(String track, SOng next) {
        this.track = track;
        this.next = next;
    }
    
}