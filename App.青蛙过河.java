import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_background=new JLabel();
    JLabel label_frog=new JLabel();
    JLabel label_frog2=new JLabel();
    JLabel label_frog3=new JLabel();
    JLabel label_score=new JLabel();
    JLabel labeltxt=new JLabel();

    JTextArea textArea_UserInput=new JTextArea();
    int  score,score1=0,score2=0,score3=0,
            score4=0,score5=0,score6=0,
            score7=0,score8=0,score9=0;

    //构造方法
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                textArea_UserInput.append(String.valueOf(e.getKeyChar()));
                        if(label_frog.getX()!=610&&label_frog.getY()!=30){
                            if (textArea_UserInput.getText().equals("hello")) {
                                label_frog.setBounds(400, 256, 128, 128);
                                textArea_UserInput.setText("");
                                score1=10;
                                score=score1+score2+score3+
                                        score4+score5+score6+
                                        score7+score8+score9;
                                label_score.setText("得分：0"+score);
                            }
                            else if (textArea_UserInput.getText().equals("world")) {
                                label_frog.setBounds(270, 100, 128, 128);
                                textArea_UserInput.setText("");
                                score2=10;
                                score=score1+score2+score3+
                                        score4+score5+score6+
                                        score7+score8+score9;
                                label_score.setText("得分：0"+score);
                            }
                            else  if (textArea_UserInput.getText().equals("hi")) {
                                label_frog.setBounds(610, 30, 128, 128);
                                textArea_UserInput.setText("");
                                score3=10;
                                score=score1+score2+score3+
                                        score4+score5+score6+
                                        score7+score8+score9;
                                label_score.setText("得分：0"+score);
                            }
                        }

                if(label_frog2.getX()!=650&&label_frog2.getY()!=30){
                    if (textArea_UserInput.getText().equals("hello")) {
                        label_frog2.setBounds(400, 256, 128, 128);
                        textArea_UserInput.setText("");
                        score4=10;
                        score=score1+score2+score3+
                                score4+score5+score6+
                                score7+score8+score9;
                        label_score.setText("得分：0"+score);
                    }
                    else if (textArea_UserInput.getText().equals("world")) {
                        label_frog2.setBounds(270, 100, 128, 128);
                        textArea_UserInput.setText("");
                        score5=10;
                        score=score1+score2+score3+
                                score4+score5+score6+
                                score7+score8+score9;
                        label_score.setText("得分：0"+score);
                    }
                    else  if (textArea_UserInput.getText().equals("hi")) {
                        label_frog2.setBounds(650, 30, 128, 128);
                        textArea_UserInput.setText("");
                        score6=10;
                        score=score1+score2+score3+
                                score4+score5+score6+
                                score7+score8+score9;
                        label_score.setText("得分：0"+score);
                    }
                }

                if(label_frog3.getX()!=700&&label_frog3.getY()!=30){
                    if (textArea_UserInput.getText().equals("hello")) {
                        label_frog3.setBounds(400, 256, 128, 128);
                        textArea_UserInput.setText("");
                        score7=10;
                        score=score1+score2+score3+
                                score4+score5+score6+
                                score7+score8+score9;
                        label_score.setText("得分：0"+score);
                    }
                    else if (textArea_UserInput.getText().equals("world")) {
                        label_frog3.setBounds(270, 100, 128, 128);
                        textArea_UserInput.setText("");
                        score8=10;
                        score=score1+score2+score3+
                                score4+score5+score6+
                                score7+score8+score9;
                        label_score.setText("得分：0"+score);
                    }
                    else  if (textArea_UserInput.getText().equals("hi")) {
                        label_frog3.setBounds(700, 30, 128, 128);
                        textArea_UserInput.setText("");
                        score9=10;
                        score=score1+score2+score3+
                                score4+score5+score6+
                                score7+score8+score9;
                        label_score.setText("得分：0"+score);
                        myPanel.remove(label_frog);
                        myPanel.remove(label_frog2);
                        myPanel.remove(label_frog3);
                        labeltxt.setBounds(350,100,400,400);
                        labeltxt.setText("Game over");
                        labeltxt.setFont(new Font("宋体",Font.BOLD,70));
                        labeltxt.setForeground(Color.red);
                    }
                }
         }
        });
    }
    //显示窗体方法
    void go(){
        textArea_UserInput.setText("");
        textArea_UserInput.setBounds(0,0,300,20);
        textArea_UserInput.setVisible(false);
        myPanel.add(textArea_UserInput);
        //分割线
        java.net.URL imgURL = App.class.getResource("img/background.png");
        label_background.setIcon(new ImageIcon(imgURL));
        label_background.setBounds(0,0,1024,600);
        //分割线
        java.net.URL imgURL2 = App.class.getResource("img/frog.png");
        label_frog.setIcon(new ImageIcon(imgURL2));
        label_frog.setBounds(100,400,128,128);
        //分割线
        java.net.URL imgURL3 = App.class.getResource("img/frog.png");
        label_frog2.setIcon(new ImageIcon(imgURL3));
        label_frog2.setBounds(150,400,128,128);
        //分割线
        java.net.URL imgURL4 = App.class.getResource("img/frog.png");
        label_frog3.setIcon(new ImageIcon(imgURL4));
        label_frog3.setBounds(200,400,128,128);
        //分割线
        label_score.setText("得分：0"+score);
        label_score.setBounds(400,-30,200,150);
        label_score.setFont(new Font("宋体",Font.BOLD,30));
        label_score.setForeground(Color.red);

        myPanel.add(label_score);
        myPanel.add(label_frog);
        myPanel.add(label_frog2);
        myPanel.add(label_frog3);
        myPanel.add(labeltxt);
        myPanel.add(label_background);
        JFrame frame = new JFrame("青蛙过河 v1.0");
        myPanel.setLayout(null);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500,200,1024,600);
        frame.setVisible(true);
        myPanel.setFocusable(true);//键盘监听必须加panel面板的焦点获取才可以
    }
    public static void main(String[] args) {
        new App().go();
    }
}
