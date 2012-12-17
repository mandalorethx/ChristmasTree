/*
 * Use this to control the lights of the christmas tree
 */
package christmastree;

/**
 * Call methods here to control the state of the lights on the tree
 * @author Matt Hoffman
 */
public class LightControl {
    
    private boolean isOn = false;
    
    /**
     * Constructor.  Initializes lights to off.
     */
    public LightControl() {
        this.isOn = false;
    }
    
    /**
     * Turn on the lights
     */
    public void turnOn() {
        this.isOn = true;
        System.out.println("The Christmas Lights are on!");
    }
    
    /**
     * Turn off the lights
     */
    public void turnOff() {
        this.isOn = false;
        System.out.println("The Christmas Lights are off!");
    }
    
    /**
     * Find out if the lights are on or off
     * @return True if lights are on, false otherwise
     */
    public boolean getState() {
        return this.isOn;
    }
}
