package render;

import math.Point;
import objects.Planet;

import java.awt.*;

@RegisterRender
public class RenderPlanet extends Render<Planet> {
    @Override
    public void render(Graphics2D g2, Planet planet) {
        Point position = planet.position;
        int radius = planet.radius;
        g2.setColor(Color.RED);
        g2.fillOval((int)position.x, (int)position.y, radius, radius);
    }
}
