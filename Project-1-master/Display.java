/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chutes.ladders;

import static chutes.ladders.Chutes.buildChute;
import static chutes.ladders.GameBoard.checkPos;
import static chutes.ladders.Ladders.buildLads;

public class Display {   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Set GameStatus True = ongoing
        boolean gameStatus = true;
        // Set noWinner true = ongoing
        boolean noWinner  = true;
        
        // Create variable to store winners name
        String winner = "";
        
        
        // Create Player Objects
        Players Matt = new Players("Matt");
        Players Dustin = new Players("Dustin");
        Players Emmanuel = new Players("Emmanuel");
        Players Jim = new Players("Jim");
        
        // Create aray of players
        Players player[] = new Players[4];
        
        // Assign players to array
        player[0] = Matt;
        player[1] = Dustin;
        player[2] = Emmanuel;
        player[3] = Jim;
        
        // Spinner 
        Spinner spin = new Spinner(8);
        
        // Build chutes and ladders\
        buildLads();
        buildChute();
                
        while (gameStatus) {
            
            for (int i=0; i < player.length; i++) {
                
                if (noWinner == true) {
                    // print whos spin
                    System.out.println(player[i].getName() + "'s turn to spin. Current Pos: " + player[i].getPos());
                    // spin and move pos
                    System.out.println(player[i].posChangeSpin(spin));
                    // spin
                    
                    // check if on special tile
                    checkPos(player[i]);
                    //print out plyer and new pos
                    System.out.println(player[i].getName() + " is now at " + player[i].getPos());
                }
                
                // Check if player reached 100
                if (player[i].getPos() > 100) {
                    
                    // set winner
                    winner = player[i].getName();
                    System.out.println(winner + " is the winner");
                    // set gameStatus to False
                    gameStatus = false;
                }
                
            }
        }
        
    }
    
}
