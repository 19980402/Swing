package gks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel = new JPanel();
    JLabel feiji = new JLabel();
    JLabel background = new JLabel();
    JTextArea jTextArea = new JTextArea();
    int x = 200;
    int y = 750;

    //构造方法
    public App() {
        jTextArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    y -= 10;
                    feiji.setBounds(x, y, 128, 128);
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    y += 10;
                    feiji.setBounds(x, y, 128, 128);
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    x -= 10;
                    feiji.setBounds(x, y, 128, 128);
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    x += 10;
                    feiji.setBounds(x, y, 128, 128);
                }
            }
        });

    }


    //显示窗体方法
    void go(){
        JFrame frame = new JFrame("我爱打飞机");
        myPanel.setLayout(null);
        myPanel.add(feiji);
        myPanel.add(background);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,700,900);
        jTextArea.setBounds(100, 700, 1, 1);
        jTextArea.setText("飞机控制台");
        //frame.pack();
        frame.setVisible(true);
        myPanel.add(feiji);
        myPanel.add(jTextArea);
        myPanel.add(background);

        java.net.URL img = App.class.getResource("background.png");
        background.setIcon(new ImageIcon(img));
        background.setBounds(0,0,700,900);

        java.net.URL img2 = App.class.getResource("plane1.png");
        feiji.setIcon(new ImageIcon(img2));
        feiji.setBounds(200,750,128,128);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
