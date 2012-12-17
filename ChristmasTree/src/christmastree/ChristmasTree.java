/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package christmastree;

import java.util.Scanner;

/**
 * Main class to simulate christmas tree
 * @author Matt Hoffman
 */
public class ChristmasTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        String command;
        
        /*
         * Create Objects (Motion Sensor, Light Control) and variables (time) 
         *  here
         */
        
        while(true) {
            System.out.println("Please Enter a Command:");
            command = sc.next();
            if(command.equals("help")) {
                System.out.println("Available Commands:");
                System.out.println("\tmove: Move in front of the sensor");
            } else if(command.equals("move")) {
                /*
                 * Move in front of the sensor. HINT - need to work with
                 * MotionSensor object you created earlier
                 */
            }
        }
        /*
         * Perform Operations on tree here (check time, check state of motion 
         * sensor, adjust lights accordingly)
         */
    }
}
