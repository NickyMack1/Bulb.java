# Bulb.java
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
public class Lights {
    public static void main(String[] args) {
        // Instantiate Bulb objects
        Bulb bulb1 = new Bulb();
        Bulb bulb2 = new Bulb();
        Bulb bulb3 = new Bulb();

        // Turn on some bulbs
        bulb1.turnOn();
        bulb3.turnOn();

        // Turn off a bulb
        bulb2.turnOff();

        // Check the status of bulbs
        System.out.println("Bulb 1 is on? " + bulb1.isOn());
        System.out.println("Bulb 2 is on? " + bulb2.isOn());
        System.out.println("Bulb 3 is on? " + bulb3.isOn());
    }
}
