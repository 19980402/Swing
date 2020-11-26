import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel background=new JLabel();
    JLabel label_score=new JLabel();
    int score,score1,score2,score3;
    //构造方法
    public App() {
        myPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                if ((e.getX()<710&&e.getX()>700)&&(e.getY()<320&&e.getY()>300)) {
                    score1=1;
                    score=score1+score2+score3;
                    label_score.setText(String.valueOf(score));
                }else
                if ((e.getX()<871&&e.getX()>860)&&(e.getY()<210&&e.getY()>190)) {
                    score2=1;
                    score=score1+score2+score3;
                    label_score.setText(String.valueOf(score));
                }else
                if ((e.getX()<975&&e.getX()>950)&&(e.getY()<233&&e.getY()>200)) {
                    score3=1;
                    score=score1+score2+score3;
                    label_score.setText(String.valueOf(score));
                }
            }
        });
    }
    //显示窗体方法
    void go(){
        label_score.setText("得分:"+score);
        label_score.setBounds(85,30,100,50);
        label_score.setFont(new Font("",Font.BOLD,20));
        label_score.setForeground(Color.RED);
        myPanel.add(label_score);

        java.net.URL imgURL1= App.class.getResource("images/background.gif");
        background.setIcon(new ImageIcon(imgURL1));
        background.setBounds(0,0,1000,800);
        myPanel.add(background);

        JFrame frame = new JFrame("找茬游戏");
        myPanel.setLayout(null);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,800);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
