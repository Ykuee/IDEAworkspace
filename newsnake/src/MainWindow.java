import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Wishism on 2015/11/8.
 */
public class MainWindow extends JFrame {
    Garden garden = new Garden();
    ScorePanel scorePanel=new ScorePanel();

    public MainWindow(String title) {
        super(title);
    }

    public void showWindow() {
        this.setLocation(400, 200);
        //this.setLayout(new BorderLayout());
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
        this.add(scorePanel,"North");
        this.add(garden,"South");
        this.pack();
        //this.setResizable(false);
        this.addKeyListener(new KeyMonitor());
        this.setVisible(true);
    }

    public class KeyMonitor extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            garden.snake.keyPressed(e);
        }
    }
}
