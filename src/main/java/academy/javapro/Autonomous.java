/* Project: Tesla Vehicle System
 * Interface: Autonomous.java
 * Author: MEHMET SOYDAN
 * Date: February 10 2024
 * This interface defines methods for autonomous vehicle functionality, such as enabling
 * or disabling autopilot and checking its status.
 */
package academy.javapro;
public interface Autonomous {
    void enableAutopilot();
    void disableAutopilot();
    boolean isAutopilotEnabled();
}
