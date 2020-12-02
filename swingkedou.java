import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;

public class App {
    JPanel myPanel = new JPanel();
    JLabel kedou = new JLabel();
    JLabel qingwa = new JLabel();
    JLabel background = new JLabel();
    JTextArea jTextArea = new JTextArea();
    JLabel labeltext=new JLabel();
    int CHELL=64;

    //构造方法
    public App() {
        jTextArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    kedou.setBounds(kedou.getX(), kedou.getY()-CHELL, 64, 64);
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    kedou.setBounds(kedou.getX(), kedou.getY()+CHELL, 64, 64);
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    kedou.setBounds(kedou.getX()-CHELL, kedou.getY(), 64, 64);
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    kedou.setBounds(kedou.getX()+CHELL, kedou.getY(), 64, 64);
                }
                if (kedou.getX()==qingwa.getX()&&kedou.getY()==qingwa.getY()) {
                    labeltext.setText("找到妈妈了");
                }
            }
        });

    }


    //显示窗体方法
    void go(){
        JFrame frame = new JFrame("蝌蚪找妈妈");
        //隐藏控制台
        myPanel.setLayout(null);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1024,800);
        jTextArea.setText("蝌蚪控制台");
        jTextArea.setBounds(100, 700, 1, 1);
        frame.setVisible(true);
        myPanel.add(kedou);
        myPanel.add(qingwa);
        myPanel.add(jTextArea);
        myPanel.add(background);
        myPanel.add(labeltext);
        labeltext.setBounds(100,100,100,100);

        URL img1 = App.class.getResource("images/son.png");
        kedou.setIcon(new ImageIcon(img1));
        kedou.setBounds(320,650,64,64);

        URL img3 = App.class.getResource("images/mother.png");
        qingwa.setIcon(new ImageIcon(img3));
        qingwa.setBounds(135,210,64,64);

        URL img2 = App.class.getResource("images/background.png");
        background.setIcon(new ImageIcon(img2));
        background.setBounds(0,0,1024,800);



    }
    public static void main(String[] args) {
        new App().go();
    }
}
