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
    JLabel text1 = new JLabel();
    JLabel text2 = new JLabel();
    JLabel text3 = new JLabel();
    JTextArea textArea_A=new JTextArea();
    Component jPanel;
    int s=0;
    //自定义字体大小
    Font f=new Font(Font.DIALOG,Font.BOLD,30);
    String list[][]={{"hello","world","hi"},{"q","w","e"},{"a","s","d"}};
    //构造方法
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                textArea_A.append(String.valueOf(e.getKeyChar()));
                //文本输入大于5清空
                if(textArea_A.getText().length()>5){
                    textArea_A.setText("");
                }
                //第一只青蛙
                if(s==0) {
                    if (qingwa1.getX()==80&&qingwa1.getY()==400&&textArea_A.getText().equals(list[0][0])) {
                        qingwa1.setBounds(400, 255, 128, 128);
                        textArea_A.setText("");
                    }
                    if (qingwa1.getX()==400&&qingwa1.getY()==255&&textArea_A.getText().equals(list[0][1])){
                        qingwa1.setBounds(270, 100, 128, 128);
                        textArea_A.setText("");
                    }
                    if (qingwa1.getX()==270&&qingwa1.getY()==100&&textArea_A.getText().equals(list[0][2])) {
                        qingwa1.setBounds(700, 25, 128, 128);
                        textArea_A.setText("");
                        JOptionPane.showMessageDialog(jPanel, "第一只青蛙过来了，还有两只没过来哟！", "提示消息",JOptionPane.WARNING_MESSAGE);
                        s++;
                    }
                }
                //第二只青蛙
                if(s==1) {
                    text1.setText(list[1][0]);
                    text2.setText(list[1][1]);
                    text3.setText(list[1][2]);
                    if (qingwa2.getX()==180&&qingwa2.getY()==400&&textArea_A.getText().equals(list[1][0])) {
                        qingwa2.setBounds(400, 255, 128, 128);
                        textArea_A.setText("");
                    }
                    if (qingwa2.getX()==400&&qingwa2.getY()==255&&textArea_A.getText().equals(list[1][1])) {
                        qingwa2.setBounds(270, 100, 128, 128);
                        textArea_A.setText("");
                    }
                    if (qingwa2.getX()==270&&qingwa2.getY()==100&&textArea_A.getText().equals(list[1][2])) {
                        qingwa2.setBounds(600, 25, 128, 128);
                        textArea_A.setText("");
                        JOptionPane.showMessageDialog(jPanel, "第二只青蛙过来了，还有一只没过来哟！", "提示消息",JOptionPane.WARNING_MESSAGE);
                        s++;
                    }
                }
                //第三只青蛙
                if(s==2) {
                    text1.setText(list[2][0]);
                    text2.setText(list[2][1]);
                    text3.setText(list[2][2]);
                    if (qingwa3.getX()==280&&qingwa3.getY()==400&&textArea_A.getText().equals(list[2][0])) {
                        qingwa3.setBounds(400, 255, 128, 128);
                        textArea_A.setText("");
                    }
                    if (qingwa3.getX()==400&&qingwa3.getY()==255&&textArea_A.getText().equals(list[2][1])) {
                        qingwa3.setBounds(270, 100, 128, 128);
                        textArea_A.setText("");
                    }
                    if (qingwa3.getX()==270&&qingwa3.getY()==100&&textArea_A.getText().equals(list[2][2])) {
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
        textArea_A.setBounds(0,520,100,20);
        textArea_A.setBackground(Color.orange);
        myPanel.add(textArea_A);
        myPanel.add(text1);
        myPanel.add(text2);
        myPanel.add(text3);
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

        URL img4 = App.class.getResource("images/background2.png");
        background.setIcon(new ImageIcon(img4));
        background.setBounds(0,0,1024,600);

        //设置字体
        text1.setBounds(430,330,100,50);
        text1.setText(list[0][0]);
        text1.setFont(f);
        text2.setBounds(280,150,100,50);
        text2.setText(list[0][1]);
        text2.setFont(f);
        text3.setBounds(600,80,100,50);
        text3.setText(list[0][2]);
        text3.setFont(f);


    }
    public static void main(String[] args) {
        new App().go();
    }
}
