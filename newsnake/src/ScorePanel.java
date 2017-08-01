import javax.swing.*;
import java.awt.*;

/**
 * Created by Wishism on 2015/11/9.
 */
public class ScorePanel extends JPanel {
    JLabel Score=new JLabel();
    ScorePanel(){
        Score.setText("Score:"+Snake.score);
        this.setSize(CommonNumber.BLOCK_SIZE * CommonNumber.COLS, CommonNumber.BLOCK_SIZE * CommonNumber.ROWS);
        this.setBackground(Color.cyan);
        this.add(Score);
        new Thread(new PaintThread()).start();
    }


    public class PaintThread implements Runnable {
        @Override
        public void run() {
            while (true) {
                repaint();
                try {
                    Score.setText("Score:"+Snake.score);
                    Thread.sleep(88);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
