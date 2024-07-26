package chapter9.lesson92;

public interface Drawable {
    void draw(); // vẽ

    void erase(); // xóa
}

interface Movable extends Drawable {
    void up(); //di chuyển xuống theo trục y

    void down(); // di chuyển lên theo trục y

    void left(); // di chuyển sang trái theo trục x

    void right(); // di chuyển sang phải theo trục x
}

interface ShapeDrawer extends Movable {
    void moveIn(); // di chuyển vào

    void moveOut(); //di chuyển ra

    void moveDiagonally(); //di chuyển theo đường chéo
}

//giả định vẽ hình 2D, gô tọa độ là góc trái trên màn hình
//tọa độ bắt đầu từ (x,y) = (0, 0)
class Shape implements ShapeDrawer {
    private int x;
    private int y;

    public Shape() {
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
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

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public void moveIn() {

    }

    @Override
    public void moveOut() {

    }

    @Override
    public void moveDiagonally() {

    }

    @Override
    public void up() {
        y--;
    }

    @Override
    public void down() {
        y++;
    }

    @Override
    public void left() {
        x--;
    }

    @Override
    public void right() {
        x++;
    }

    @Override
    public void draw() {

    }

    @Override
    public void erase() {

    }
}