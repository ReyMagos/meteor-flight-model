package gui;

import javax.swing.*;
import java.awt.*;

public class SpaceControlPanel extends JPanel {
    public SpaceControlPanel() {
        init();
        createContent();
    }

    private void init() {

    }

    private void createContent() {
        Icon planetIcon = new ImageIcon("planet.png");
        ImageButton addPlanet = new ImageButton(planetIcon);
        addPlanet.setPreferredSize(new Dimension(80, 80));
        add(addPlanet);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(Window.getScreenWidth(), 120);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        super.paintComponent(g2);
        setBackground(Color.GRAY);
    }
}
