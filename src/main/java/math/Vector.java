package math;

public class Vector {
    public Position start;
    public Position end;

    public Vector(Position start, Position end) {
        this.start = start;
        this.end = end;
    }

    public Position addMovement(Vector other) {
        return this.getVectorMovement().add(other.getVectorMovement());
    }

    public Position getVectorMovement() {
        return end.subtract(start);
    }

    public Vector copy() {
        return new Vector(start, end);
        //TODO: Check is needed positions copying (start.copy(), end.copy())
    }
}
