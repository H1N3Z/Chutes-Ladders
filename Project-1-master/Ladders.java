/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chutes.ladders;
/**
 *
 * @author matthines
 */
public class Ladders extends GameBoard {
    // Create Ladders
    public static int ladder[][] = new int[5][2];
    // These are two value arrays
    // Build Ladders
    public static void buildLads() {
        
        // First Ladder
        ladder[0][0] = 4;
        ladder[0][1] = 35;
        // 2nd Ladder
        ladder[1][0] = 18;
        ladder[1][1] = 28;
        //3rd Ladder
        ladder[2][0] = 32;
        ladder[2][1] = 45;
        //4th ladder
        ladder[3][0] = 50;
        ladder[3][1] = 76;
        //5th Ladder
        ladder[4][0] = 67;
        ladder[4][1] = 92;
        
    }
    
}
