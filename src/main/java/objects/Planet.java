package objects;

import math.Point;

public class Planet extends SpaceObject {

    public int gravityRadius;
    public int atmosphereThickness;

    public Planet(Point position, int radius, int gravityRadius, int atmosphereThickness) {
        super(position, radius);
        this.gravityRadius = gravityRadius;
        this.atmosphereThickness = atmosphereThickness;
    }
}
