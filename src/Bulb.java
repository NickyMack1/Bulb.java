public class Bulb {
    private boolean isOn;

    // Constructor
    public Bulb() {
        isOn = false; // Bulb is initially off
    }

    // Method to turn on the bulb
    public void turnOn() {
        isOn = true;
        System.out.println("The bulb is now on.");
    }

    // Method to turn off the bulb
    public void turnOff() {
        isOn = false;
        System.out.println("The bulb is now off.");
    }

    // Method to check if the bulb is on
    public boolean isOn() {
        return isOn;
    }
}