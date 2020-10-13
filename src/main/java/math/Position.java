package math;

public class Position {
    public int x;
    public int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position subtract(Position other) {
        return new Position(this.x - other.x, this.y - other.y);
    }

    public Position add(Position other) {
        return new Position(this.x + other.x, this.y + other.y);
    }

    public Position copy() {
        return new Position(x, y);
    }
}
