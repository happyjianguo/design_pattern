package com.design.parttern.operations.strategy.good2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Test extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new Test();
        frame.setBounds(100, 100, 500, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.show();
    }

    public Test() {
        super("Creating a New Border Type");
        Container contentPane = getContentPane();
        JPanel[] panels = { new JPanel(), new JPanel(), new JPanel() };
        Border[] borders = { new HandleBorder(), new HandleBorder(Color.red, 8), new HandleBorder(Color.blue, 10) };
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        for (int i = 0; i < panels.length; ++i) {
            panels[i].setPreferredSize(new Dimension(100, 100));
            panels[i].setBorder(borders[i]);
            contentPane.add(panels[i]);
        }
    }
}
