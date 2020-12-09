import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_text=new JLabel();
    List<JLabel> label_list=new ArrayList<>();

    //构造方法
    public App() {
        label_list.add(new JLabel());
        label_list.add(new JLabel());
        label_list.add(new JLabel());

        java.net.URL imgURL = App.class.getResource("images/ball.png");
        //第一张图
        label_list.get(0).setIcon(new ImageIcon(imgURL));
        label_list.get(0).setBounds(100,100,128,128);
        myPanel.add(label_list.get(0));
        //第二张图
        label_list.get(1).setIcon(new ImageIcon(imgURL));
        label_list.get(1).setBounds(200,100,128,128);
        myPanel.add(label_list.get(1));
        //第三张图
        label_list.get(2).setIcon(new ImageIcon(imgURL));
        label_list.get(2).setBounds(300,100,128,128);
        myPanel.add(label_list.get(2));
    }
    //显示窗体方法
    void go(){
        label_text.setText("这是一个Label标签。");
        label_text.setBounds(0,0,200,30);
        myPanel.add(label_text);

        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1024,720);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
