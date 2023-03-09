import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Sprite {
    private int x = 40;
    private int y = 60;
    private int dx;
    private int dy;
    private int w;
    private int h;
    private Image image;
    public Sprite(){
        ImageIcon ii = new ImageIcon("apple.png");
        image = ii.getImage();
        w = image.getWidth(null);
        h = image.getHeight(null);
    }

    public void move(){
        x += dx;
        y += dy;
    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = -2;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 2;
        }

        if (key == KeyEvent.VK_UP) {
            dy = -2;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 2;
        }
    }

    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }

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

    public Image getImage() {
        return image;
    }
}
