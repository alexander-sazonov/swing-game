import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame implements ActionListener {

    private Sprite sprite;
    private Timer timer;
    private final int DELAY = 10;

    public GameWindow(){
        initWindow();
    }

    private void initWindow(){
        addKeyListener(new MyKeyboardListener());
        setBackground(Color.black);
        setFocusable(true);
        sprite = new Sprite();
        timer = new Timer(DELAY, this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}