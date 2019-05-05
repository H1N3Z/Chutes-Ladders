
package chutes.ladders;

public class Chutes extends GameBoard {
    
    /**
     *
     */
    protected static int chute[][] = new int[5][2];
   
    public static void buildChute() {
        
        // First chute
        chute[0][0] = 23;
        chute[0][1] = 5;
        //2nd Chute
        chute[1][0] = 36;
        chute[1][1] = 22;
        //3rd Chute
        chute[2][0] = 44;
        chute[2][1] = 33;
        //4th Chute
        chute[3][0] = 75;
        chute[3][1] = 30;
        //5th Chute
        chute[4][0] = 99;
        chute[4][1] = 1;
        
    }
    
    
}
