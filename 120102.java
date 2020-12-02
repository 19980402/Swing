package gks;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_p=new JLabel();
    JLabel label_back=new JLabel();
    JLabel label_text=new JLabel();

    int x=400;
    int y=200;
    int w=68;
    int h=68;
    int source;
    //构造方法
    public App() {
        myPanel.setFocusable(true);//键盘监听必须加panel面板的焦点获取才可以

        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode()==KeyEvent.VK_LEFT){
                    x-=10;
                    label_p.setBounds(x,y,w,h);
                }
                if (e.getKeyCode()==KeyEvent.VK_RIGHT){
                    x+=10;
                    label_p.setBounds(x,y,w,h);
                }
                if (e.getKeyCode()==KeyEvent.VK_UP){
                    y-=10;
                    label_p.setBounds(x,y,w,h);
                }
                if (e.getKeyCode()==KeyEvent.VK_DOWN){
                    y+=10;
                    label_p.setBounds(x,y,w,h);
                }
                    if (label_p.getX()==400 && label_p.getY()==100){

                            source++;
                            label_text.setText("得分："+String.valueOf(source));


                }

            }

        });
    }
    //显示窗体方法
    void go(){
        java.net.URL img = App.class.getResource("img/ball.gif");
        label_p.setIcon(new ImageIcon(img));
        label_p.setBounds(0,0,w,h);
        java.net.URL img2 = App.class.getResource("img/background.png");
        label_back.setIcon(new ImageIcon(img2));
        label_back.setBounds(0,0,w,h);

        label_text.setText("得分：");
        label_text.setBounds(0,0,100,100);
        myPanel.add(label_text);
        label_p.setText("");
        label_p.setBounds(400,200,68,68);
        myPanel.add(label_p);
        label_back.setText("");
        label_back.setBounds(400,100,68,68);
        myPanel.add(label_back);

        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,1020);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
