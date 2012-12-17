/*
 * Class Representatin a motion sensor
 */
package christmastree;

/**
 * This class simulates a motion sensor.  When move() is called, it assumes
 *  that the sensor has detected movement.  didMove() can be called to see if 
 *  movement has been detected
 * @author Matt Hoffman
 */
public class MotionSensor {
    
    private boolean detected = false;
    private long ltime = 0L;
    private static final long ttl = 1L;
    
    /**
     * Constructor for the Motion Sensor.  Initializes variables.
     */
    public MotionSensor() {
        this.detected = false;
        this.ltime = 0L;
    }
    
    /**
     * Tell the sensor that something has moved
     */
    public void move() {
        this.detected = true;
        this.ltime = System.currentTimeMillis()/1000;
    }
    
    /**
     * Check if something has moved recently
     * @return True if movement detected les than 1 second ago, false otherwise
     */
    public boolean didMove() {
        if(System.currentTimeMillis()/1000 - this.ltime > this.ttl) {
            this.detected = false;
        }
        return this.detected;
    }
}
