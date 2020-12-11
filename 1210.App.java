# 9宫格矩阵拼图
import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_background=new JLabel();
    List<JLabel> label_list=new ArrayList<>();
    int array2d[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,11,0}
    };
    int cell=128;
    //构造方法
    public App() {
        myPanel.setFocusable(true);//键盘监听必须加panel面板的焦点获取才可以
        //键盘监听事件
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);//敲击任意键。
                //以下三行代码，表示有图小图相对于窗体向下移动了三步
                new Zero().goUp(array2d);
                new Zero().goUp(array2d);
                new Zero().goUp(array2d);
                showMyGame();
            }
        });
    }

    //为了使程序结构清晰，设置一个方法来显示所有组件showMyGame()
    void showMyGame(){
        //双重for循环，可以设置x，y坐标，还可以添加mypanel元素。
        //移动矩阵
        for (int row = 0; row < array2d.length; row++) {
            for (int column = 0; column < array2d[0].length; column++) {
                label_list.add(new JLabel());
                java.net.URL imgURL = App.class.getResource("images/nezha_" + String.valueOf(array2d[row][column]) + ".png");
                label_list.get(row * 3 + column).setIcon(new ImageIcon(imgURL));
                label_list.get(row * 3 + column).setBounds(column * cell, row * cell, cell, cell);
                myPanel.add(label_list.get(row * 3 + column));
                myPanel.repaint();
            }
        }
    }
    //显示窗体方法
    void go(){
        //网格
        java.net.URL imgURL999 = App.class.getResource("images/foreground.png");
        label_background.setIcon(new ImageIcon(imgURL999));
        label_background.setBounds(0,0,384,512);
        myPanel.add(label_background);

        myPanel.setLayout(null);
        JFrame frame = new JFrame("拼图");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,384,512);
        frame.setVisible(true);
        frame.setResizable(false);//禁止拉伸大小窗口
    }
    public static void main(String[] args) {
        new App().go();
    }
}
