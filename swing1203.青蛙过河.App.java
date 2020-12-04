import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;

public class App {
    JPanel myPanel = new JPanel();
    JLabel qingwa1 = new JLabel();
    JLabel qingwa2 = new JLabel();
    JLabel qingwa3 = new JLabel();
    JLabel background = new JLabel();
    JTextArea textArea_A=new JTextArea();
    Component jPanel;
    int s=0;
    //构造方法
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                textArea_A.append(String.valueOf(e.getKeyChar()));
                //第一只青蛙
                if(s==0) {
                    if (textArea_A.getText().equals("hello")) {
                        qingwa1.setBounds(400, 255, 128, 128);
                        textArea_A.setText("");
                    }
                    if (textArea_A.getText().equals("world")) {
                        qingwa1.setBounds(270, 100, 128, 128);
                        textArea_A.setText("");
                    }
                    if (textArea_A.getText().equals("hi")) {
                        qingwa1.setBounds(700, 25, 128, 128);
                        textArea_A.setText("");
                        JOptionPane.showMessageDialog(jPanel, "第一只青蛙过来了，还有两只没过来哟！", "提示消息",JOptionPane.WARNING_MESSAGE);
                        s++;
                    }
                }
                //第二只青蛙
                if(s==1) {
                    if (textArea_A.getText().equals("hello")) {
                        qingwa2.setBounds(400, 255, 128, 128);
                        textArea_A.setText("");
                    }
                    if (textArea_A.getText().equals("world")) {
                        qingwa2.setBounds(270, 100, 128, 128);
                        textArea_A.setText("");
                    }
                    if (textArea_A.getText().equals("hi")) {
                        qingwa2.setBounds(600, 25, 128, 128);
                        textArea_A.setText("");
                        JOptionPane.showMessageDialog(jPanel, "第二只青蛙过来了，还有一只没过来哟！", "提示消息",JOptionPane.WARNING_MESSAGE);
                        s++;
                    }
                }
                //第三只青蛙
                if(s==2) {
                    if (textArea_A.getText().equals("hello")) {
                        qingwa3.setBounds(400, 255, 128, 128);
                        textArea_A.setText("");
                    }
                    if (textArea_A.getText().equals("world")) {
                        qingwa3.setBounds(270, 100, 128, 128);
                        textArea_A.setText("");
                    }
                    if (textArea_A.getText().equals("hi")) {
                        qingwa3.setBounds(500, 25, 128, 128);
                        textArea_A.setText("");
                        JOptionPane.showMessageDialog(jPanel, "恭喜您过河成功啦！！", "提示消息",JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        });
    }


    //显示窗体方法
    void go(){
        JFrame frame = new JFrame("青蛙过河");
        myPanel.setLayout(null);
        myPanel.setFocusable(true);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,1024,600);
        frame.setVisible(true);


        textArea_A.setText("");
        textArea_A.setBounds(0,0,100,50);
        textArea_A.setBackground(Color.orange);
        myPanel.add(textArea_A);
        myPanel.add(qingwa1);
        myPanel.add(qingwa2);
        myPanel.add(qingwa3);
        myPanel.add(background);



        URL img1 = App.class.getResource("images/frog.png");
        qingwa1.setIcon(new ImageIcon(img1));
        qingwa1.setBounds(80,400,128,128);


        URL img2 = App.class.getResource("images/frog.png");
        qingwa2.setIcon(new ImageIcon(img2));
        qingwa2.setBounds(180,400,128,128);

        URL img3 = App.class.getResource("images/frog.png");
        qingwa3.setIcon(new ImageIcon(img3));
        qingwa3.setBounds(280,400,128,128);


        URL img4 = App.class.getResource("images/background.png");
        background.setIcon(new ImageIcon(img4));
        background.setBounds(0,0,1024,600);

    }
    public static void main(String[] args) {
        new App().go();
    }
}
