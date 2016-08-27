package responsibility.chain_of_responsibility.java_world.awt;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Event;
import java.awt.Frame;

/**
 * The CoR pattern was not applicable for AWT events because GUI events are much
 * too fine-grained; because there are so many events, and components handle
 * them so frequently, the CoR pattern resulted in an explosion of subclasses—an
 * average GUI could easily have upwards of 50 component subclasses for the
 * single purpose of handling events. Finally, propagation of events was rarely
 * used; typically, events are handled by the component in which they
 * originated.
 * 
 * @author Administrator
 *
 */
public class MouseSensor extends Frame {
    public static void main(String[] args) {
        MouseSensor ms = new MouseSensor();
        ms.setBounds(10, 10, 200, 200);
        ms.show();
    }

    public MouseSensor() {
        setLayout(new BorderLayout());
        add(new MouseSensorCanvas(), "Center");
    }

    class MouseSensorCanvas extends Canvas {
        public boolean mouseUp(Event event, int x, int y) {
            System.out.println("mouse up");
            return true; // Event has been handled. Do not propagate to
                         // container.
        }

        public boolean mouseDown(Event event, int x, int y) {
            System.out.println("mouse down");
            return true; // Event has been handled. Do not propagate to
                         // container.
        }
    }
}
