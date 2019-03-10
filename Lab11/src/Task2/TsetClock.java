/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2;

/**
 *
 * @author Pierre
 */
public class TsetClock {
    
    public static void main(String[] args) {
        //Creating inctance of NumverDisplay
        NumberDisplay n1 = new NumberDisplay(60);
        
        //For loop for time to go
        for (int i = 0; i < 3700; i++){
            System.out.println(n1.toString());
            n1.time();
            
        }
    }
}
