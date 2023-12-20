package mirea.javaLessons.practical12;

public abstract class Shape {
    private int rcolor, gcolor, bcolor, x, y;

    public Shape(int rcolor, int gcolor, int bcolor, int x, int y) {
        this.rcolor = rcolor;
        this.gcolor = gcolor;
        this.bcolor = bcolor;
        this.x = x;
        this.y = y;
    }

    public int[] getColor() {
        return new int[]{this.rcolor, this.gcolor, this.bcolor};
    }

    public void setColor(int rcolor, int gcolor, int bcolor) {
        this.rcolor = rcolor;
        this.gcolor = gcolor;
        this.bcolor = bcolor;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
