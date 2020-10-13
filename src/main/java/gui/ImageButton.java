package gui;

import javax.swing.*;

public class ImageButton extends JButton {
    public ImageButton(Icon icon) {
        super(icon);
        init();
    }

    private void init() {
        setBorder(BorderFactory.createEmptyBorder());
        setContentAreaFilled(false);
    }
}
