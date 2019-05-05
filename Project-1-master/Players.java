/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chutes.ladders;


public class Players {
    
    // Players Class
    
    private int pos;        // Dont make these final
    private String name;
    
    public Players(String nam) {
        name = nam;
        pos = 0; // Make default pos 0
    }   
    
    // Get Name

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }
    // Get Position
    public int getPos() {
        return pos;
    }
    
    // Set a Pos
    public void setPos(int p) {
        pos = p;
    }
    
    
   
    
    // Method for players pos change due to spin
    public int posChangeSpin(Spinner s) {
        int num = s.spin();
        pos = pos + num;
        return num;
        
    }
   
    @Override
    public String toString() {
        return super.toString() + "Name: " + name + "/nPosition: " + pos;
    }
        
    
}
