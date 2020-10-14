package render;

import math.Point;
import objects.Meteor;

import java.awt.*;

@RegisterRender
public class RenderMeteor extends Render<Meteor> {
    @Override
    public void render(Graphics2D g2, Meteor meteor) {
        Point position = meteor.position;
        int radius = meteor.radius;
        g2.setColor(Color.GRAY);
        g2.fillOval((int)position.x, (int)position.y, radius, radius);
    }
}
