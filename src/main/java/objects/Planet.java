package objects;

import math.Position;

public class Planet extends SpaceObject {

    public int gravityRadius;
    public int atmosphereThickness;

    public Planet(Position position, int radius, int gravityRadius, int atmosphereThickness) {
        super(position, radius);
        this.gravityRadius = gravityRadius;
        this.atmosphereThickness = atmosphereThickness;
    }
}
