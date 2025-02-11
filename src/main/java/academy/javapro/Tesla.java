/* Project: Tesla Vehicle System
 * Class: Tesla.java
 * Author: MEHMET SOYDAN
 * Date: February 10 2024
 * This class represents a Tesla vehicle, extending the Vehicle class and implementing
 * the Electric and Autonomous interfaces. It provides concrete implementations for all
 * abstract and interface methods.
 */
package academy.javapro;
public class Tesla extends Vehicle implements Electric, Autonomous {
    private boolean autopilotEnabled;
    private boolean charging;

    // ---------------------------------------------------------------
    // Constructor to initialize Tesla model and year.
    public Tesla(String model, int year) {
        super("Tesla", model, year); // Set make to "Tesla"
        this.autopilotEnabled = false; // Initialize autopilotEnabled to false
        this.charging = false; // Initialize charging to false
    }

    // ---------------------------------------------------------------
    // Implement Vehicle abstract methods

    public void startEngine() {
        isRunning = true;
        System.out.println(make + " " + model + " started");
    }


    public void stopEngine() {
        isRunning = false;
        System.out.println(make + " " + model + " stopped");
    }


    public void accelerate() {
        System.out.println(make + " " + model + " is accelerating...");
    }


    public void brake() {
        System.out.println(make + " " + model + " is braking...");
    }

    // ---------------------------------------------------------------
    // Implement Electric interface methods

    public void charge() {
        charging = true;
        System.out.println(make + " " + model + " is now charging");
    }


    public boolean isCharging() {
        return charging;
    }

    // ---------------------------------------------------------------
    // Implement Autonomous interface methods

    public void enableAutopilot() {
        autopilotEnabled = true;
        System.out.println("Autopilot enabled");
    }


    public void disableAutopilot() {
        autopilotEnabled = false;
        System.out.println("Autopilot disabled");
    }


    public boolean isAutopilotEnabled() {
        return autopilotEnabled;
    }
}
