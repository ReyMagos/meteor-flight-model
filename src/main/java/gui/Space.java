package gui;

import objects.SpaceObject;
import render.RenderFactory;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Space extends Window {

    private final ArrayList<SpaceObject> objects = new ArrayList<>();
    private JPanel space;

    @Override
    protected void init() {
        setLayout(new BorderLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(Window.fullscreen());
        setUndecorated(true);
    }

    @Override
    protected void createContent() {
        JPanel space = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D)g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                super.paintComponent(g2);
                drawSky(g2);
                for (SpaceObject object: objects) {
                    RenderFactory.makeRenderFor(object, g2);
                }
            }
        };
        space.setBackground(Color.BLACK);
        space.setPreferredSize(getScreenSize());
        this.space = space;
        add(space);

        SpaceControlPanel controlPanel = new SpaceControlPanel();
        add(controlPanel, BorderLayout.PAGE_START);
    }

    private void drawSky(Graphics2D g2) {
        g2.setColor(Color.WHITE);
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            int x = random.nextInt(getScreenWidth());
            int y = random.nextInt(getScreenHeight());
            g2.fillOval(x, y, 5, 5);
        }
    }

    public void add(SpaceObject object) {
        objects.add(object);
        space.repaint();
    }
}
