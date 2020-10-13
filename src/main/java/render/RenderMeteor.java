package render;

import math.Position;
import objects.Meteor;

import java.awt.*;

@RegisterRender
public class RenderMeteor extends Render<Meteor> {
    @Override
    public void render(Graphics2D g2, Meteor meteor) {
        Position position = meteor.position;
        int radius = meteor.radius;
        g2.setColor(Color.GRAY);
        g2.fillOval(position.x, position.y, radius, radius);
    }
}
