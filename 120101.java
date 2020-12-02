import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel = new JPanel();
    JLabel feiji = new JLabel();
    JLabel background = new JLabel();
    JTextArea jTextArea = new JTextArea();
    int CHELL=10;

    //构造方法
    public App() {
        jTextArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    feiji.setBounds(feiji.getX(), feiji.getY()-CHELL, 128, 128);
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    feiji.setBounds(feiji.getX(), feiji.getY()+CHELL, 128, 128);
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    feiji.setBounds(feiji.getX()-CHELL, feiji.getY(), 128, 128);
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    feiji.setBounds(feiji.getX()+CHELL, feiji.getY(), 128, 128);
                }
            }
        });

    }


    //显示窗体方法
    void go(){
        JFrame frame = new JFrame("我爱打飞机");
        //隐藏控制台
        myPanel.setLayout(null);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,700,900);
        jTextArea.setText("飞机控制台");
        jTextArea.setBounds(100, 700, 1, 1);
        frame.setVisible(true);
        myPanel.add(feiji);
        myPanel.add(jTextArea);
        myPanel.add(background);

        java.net.URL img1 = App.class.getResource("images/plane0.png");
        feiji.setIcon(new ImageIcon(img1));
        feiji.setBounds(300,750,128,128);

        java.net.URL img2 = App.class.getResource("images/background.png");
        background.setIcon(new ImageIcon(img2));
        background.setBounds(0,0,700,900);

    }
    public static void main(String[] args) {
        new App().go();
    }
}
