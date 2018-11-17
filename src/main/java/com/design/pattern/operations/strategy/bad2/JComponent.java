package com.design.pattern.operations.strategy.bad2;

import java.awt.Graphics;

public class JComponent {

    public static final int LINE_BORDER = 0;
    public static final int ETCHED_BORDER = 1;
    public static final int TITLED_BORDER = 2;

    protected void paintBorder(Graphics g) {
        switch (getBorderType()) {
        case LINE_BORDER:
            paintLineBorder(g);
            break;
        case ETCHED_BORDER:
            paintEtchedBorder(g);
            break;
        case TITLED_BORDER:
            paintTitledBorder(g);
            break;
        }
    }

    private int getBorderType() {
        return 1;
    }

    private void paintLineBorder(Graphics g) {

    }
    
    private void paintEtchedBorder(Graphics g) {

    }
    
    private void paintTitledBorder(Graphics g) {

    }
    
}
