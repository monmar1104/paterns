package pl.codeleak.patterns.polymorphism;

import com.google.common.base.MoreObjects;

class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("x", x)
                          .add("y", y)
                          .toString();
    }
}
