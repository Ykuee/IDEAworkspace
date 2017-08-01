import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by Wishism on 2015/11/8.
 */
public class Garden extends Canvas {
    Snake snake = new Snake();
    Apple apple = new Apple();

    //双缓冲
    Image offScreenImage = null;

    public Garden() {
        this.setSize(CommonNumber.BLOCK_SIZE * CommonNumber.COLS, CommonNumber.BLOCK_SIZE * CommonNumber.ROWS);
        this.setBackground(new Color(233, 233, 233));
        //this.addKeyListener(new KeyMonitor()); //不知道为啥在canvas添加键盘事件无效……QAQ
        new Thread(new PaintThread()).start();
    }

    @Override
    public void paint(Graphics g) {
        Color c = g.getColor();
        g.setColor(new Color(233, 233, 233));
        g.fillRect(0,0,CommonNumber.BLOCK_SIZE * CommonNumber.COLS, CommonNumber.BLOCK_SIZE * CommonNumber.ROWS);
        g.setColor(Color.lightGray);
        /*画横线*/
        for (int i = 0; i < CommonNumber.ROWS; i++) {
            g.drawLine(0, CommonNumber.BLOCK_SIZE * i, CommonNumber.BLOCK_SIZE * CommonNumber.COLS, CommonNumber.BLOCK_SIZE * i);
        }
        /*画竖线*/
        for (int i = 1; i < CommonNumber.COLS; i++) {
            g.drawLine(CommonNumber.BLOCK_SIZE * i, 0, CommonNumber.BLOCK_SIZE * i, CommonNumber.BLOCK_SIZE * CommonNumber.ROWS);
        }

        snake.draw(g);
        apple.draw(g);
        snake.eat(apple);
        if(snake.isAlive()==false){
            g.setColor(Color.blue);
            Font font=new Font("宋体",Font.CENTER_BASELINE,30);
            g.setFont(font);
            g.drawString("游戏结束",180,100);
            g.drawString("得分："+Snake.score,180,140);
        }
        g.setColor(c);
    }

    @Override
    public void update(Graphics g) {
        //super.update(g);
        if (offScreenImage == null)
            offScreenImage = this.createImage(CommonNumber.BLOCK_SIZE * CommonNumber.COLS, CommonNumber.BLOCK_SIZE * CommonNumber.ROWS);
        Graphics gOff = offScreenImage.getGraphics();
        if(gOff!=null){
            paint(gOff);
        }
        else{
            paint(g);
        }
        g.drawImage(offScreenImage, 0, 0, this);
    }

    /*public class KeyMonitor extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            //super.keyPressed(e);
            snake.keyPressed(e);
        }
    }*/

    public class PaintThread implements Runnable {
        @Override
        public void run() {
            while (snake.isAlive()) {
                repaint();
                try {
                    Thread.sleep(88);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
