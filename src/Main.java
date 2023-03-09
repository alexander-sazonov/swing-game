import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.add(new GameWindow());
        window.setSize(400, 300);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}