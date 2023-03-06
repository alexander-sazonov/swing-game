import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyboardListener implements KeyListener {
    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        char key = e.getKeyChar();
        JOptionPane.showMessageDialog(
                null,
                key,
                "Key pressed",
                JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}
