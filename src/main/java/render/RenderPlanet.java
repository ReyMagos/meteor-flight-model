package render;

import math.Position;
import objects.Planet;

import java.awt.*;

@RegisterRender
public class RenderPlanet extends Render<Planet> {
    @Override
    public void render(Graphics2D g2, Planet planet) {
        Position position = planet.position;
        int radius = planet.radius;
        g2.setColor(Color.RED);
        g2.fillOval(position.x, position.y, radius, radius);
    }
}
