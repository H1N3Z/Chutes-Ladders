/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chutes.ladders;

import static chutes.ladders.Chutes.buildChute;
import static chutes.ladders.Chutes.chute;
import static chutes.ladders.Ladders.buildLads;
import static chutes.ladders.Ladders.ladder;

public class GameBoard {
    
    // Make Ladders
    public void makeLads() {
        buildLads();
    }
    
    // Make Chutes
    public void makeChutes() {
        buildChute();
    }
    
    public static void checkPos(Players i) {
        // for loop for how many ladder sets
        for (int u=0; u < 5; u++) {
            // check pos vs ladder bottoms
            if (i.getPos() == ladder[u][0]) {
                // Set new pos to top of lad
                i.setPos(ladder[u][1]);
                System.out.println("You Landed on a Ladder");
            }
            
            //checl pos vs cute tops
            if (i.getPos() == chute[u][0]) {
                // Set new pos to bottom of cute
                i.setPos(chute[u][1]);
                System.out.println("Oh chute, You Landed on a Chute");
                
            }
        }       
        
    }
}
