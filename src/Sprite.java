import javax.swing.*;
import java.awt.*;

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
    }
}
