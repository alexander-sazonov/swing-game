import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameWindow extends JPanel implements ActionListener {

    private Sprite sprite;
    private Timer timer;
    private final int DELAY = 10;

    public GameWindow(){
        initWindow();
    }

    private void initWindow(){
        addKeyListener(new TAdapter());
        setBackground(Color.black);
        setFocusable(true);
        sprite = new Sprite();
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
        sprite.move();
        repaint();
    }

    class TAdapter extends KeyAdapter{

        @Override
        public void keyPressed(KeyEvent e) {
            sprite.keyPressed(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            sprite.keyReleased(e);
        }
    }
}