package objects;

import math.Position;

//TODO: gui.Space objects are solely circles. This is not good thing.
public class SpaceObject {

    public Position position;
    public int radius;

    public SpaceObject(Position position, int radius) {
        this.position = position;
        this.radius = radius;
    }
}
