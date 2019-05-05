/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chutes.ladders;


// Imports
import java.util.Random;

public class Spinner  {
    
    protected int numOnSpinner;
    protected int newSpin1;
    
    public Spinner(int num) {
        
        numOnSpinner = num; // How many numbers on spinner
    }
    
    public int spin() {
        Random gen = new Random();
        int newSpin = (gen.nextInt(numOnSpinner) + 1);
        newSpin1 = newSpin;
        return newSpin;
        
    }
    
    @Override
    public String toString() {
        return "Your Spin: " + newSpin1;
    }
   
}
