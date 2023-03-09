import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class GameWindow extends JPanel implements ActionListener {

    private Sprite sprite;
    private Timer timer;
    private final int DELAY = 10;

    private int k;

    public GameWindow(){
        initWindow();
    }

    private void initWindow(){
        setSize(400, 300);
        addKeyListener(new TAdapter());
        setBackground(Color.black);
        setFocusable(true);
        sprite = new AppleSprite("apple.png", 60, 60);
        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d  = (Graphics2D) g;
        g2d.drawImage(sprite.getImage(),sprite.getX(), sprite.getY(), this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        Random rnd = new Random();
        int dx = rnd.nextInt(getWidth());
        int dy = rnd.nextInt(getHeight());
        if (k == 100){
            sprite.move(dx, dy);
            k = 0;
        }else {
            k += 1;
        }

        repaint();
    }

    class TAdapter extends KeyAdapter{

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
}