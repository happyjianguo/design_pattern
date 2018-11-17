package com.design.pattern.responsibility.chain_of_responsibility.java_world.awt;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * 
 * The delegation model—where a component delegates event handling to another
 * object—doesn't require extending component classes, which is a much simpler
 * solution. With the delegation event model, event methods return void because
 * events are no longer automatically propagated to a component's container.
 * 
 *
 */
public class MouseSensor2 extends Frame {
    public static void main(String[] args) {
        MouseSensor ms = new MouseSensor();
        ms.setBounds(10, 10, 200, 200);
        ms.show();
    }

    public MouseSensor2() {
        Canvas canvas = new Canvas();
        canvas.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                System.out.println("mouse down");
            }

            public void mouseReleased(MouseEvent e) {
                System.out.println("mouse up");
            }
        });
        setLayout(new BorderLayout());
        add(canvas, "Center");
    }
}
