package objects;

import math.Point;

//TODO: gui.Space objects are solely circles. This is not good thing.
public class SpaceObject {

    public Point position;
    public int radius;

    public SpaceObject(Point position, int radius) {
        this.position = position;
        this.radius = radius;
    }
}
