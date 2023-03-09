import javax.swing.*;
import java.awt.*;

public abstract class Sprite {
    private int x;
    private int y;
    private int w;
    private int h;
    private Image image;
    public Sprite(String fileImage, int x, int y){
        ImageIcon ii = new ImageIcon(fileImage);
        image = ii.getImage();
        w = image.getWidth(null);
        h = image.getHeight(null);
        this.x = x;
        this.y = y;
    }

    public abstract void move(int dx, int dy);


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getW() {
        return w;
    }

    public int getH() {
        return h;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setW(int w) {
        this.w = w;
    }

    public void setH(int h) {
        this.h = h;
    }

    public Image getImage() {
        return image;
    }
}
