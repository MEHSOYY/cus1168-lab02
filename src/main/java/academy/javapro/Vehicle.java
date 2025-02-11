/* Project: Tesla Vehicle System
 * Class: Vehicle.java
 * Author: MEHMET SOYDAN
 * Date: February 10 2024
 * This abstract class represents a generic vehicle with properties like make, model, year,
 * and running status. It includes abstract methods for vehicle behavior.
 */
package academy.javapro;
public abstract class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected boolean isRunning;

    // ---------------------------------------------------------------
    // Constructor to initialize make, model, and year.
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.isRunning = false; // Initialize isRunning to false
    }

    // Abstract methods to be implemented by subclasses
    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract void accelerate();
    public abstract void brake();

    // ---------------------------------------------------------------
    // Getter and setter methods for all fields
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }
}
