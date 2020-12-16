# 9宫格矩阵拼图
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class App {
    JPanel myPanel=new JPanel();
    //步数
    JLabel label_txt=new JLabel();
    //分割线图
    JLabel label_foreground=new JLabel();

    //计步数
    int bushu=0;
    //计拼图正确块数
    int gameOver=0;
    //打乱的拼图
//    int map[][]={
//            {1,3,2},
//            {4,7,6},
//            {9,8,5},
//            {10,11,0}
//    };
    //测试
    int map[][]={
            {9,1,2},
            {3,4,5},
            {0,7,8},
            {6,10,11}
    };

    //拼好的拼图
    int map2[][]={
            {9,1,2},
            {3,4,5},
            {6,7,8},
            {0,10,11}
    };
    int cell=128;
    List<JLabel> label_list=new ArrayList<>();
    //构造方法
    public App() {
        //网格
        java.net.URL imgURL999 = App.class.getResource("img/foreground.png");
        label_foreground.setIcon(new ImageIcon(imgURL999));
        label_foreground.setBounds(0,0,384,512);
        myPanel.add(label_foreground);

        //移动矩阵
        new Zero().goLeft(map);

        for (int row = 0; row < map.length; row++) {
            for (int column = 0; column < map[0].length; column++) {
                label_list.add(new JLabel());
                java.net.URL imgURL = App.class.getResource("img/dj_"+
                        String.valueOf(map[row][column])+".png");
                label_list.get(row*3+column).setIcon(new ImageIcon(imgURL));
                label_list.get(row*3+column).setBounds
                        (column*cell,row*cell,cell,cell);
                myPanel.add(label_list.get(row*3+column));
            }
        }

        //键盘监听
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);

                    if (e.getKeyCode() == KeyEvent.VK_UP) {
                        new Zero().goDown(map);
                        showMyGame();
                        bushu++;
                        label_txt.setText("步数:"+String.valueOf(bushu));
                    }
                    if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                        new Zero().goRight(map);
                        showMyGame();
                        bushu++;
                        label_txt.setText("步数:"+String.valueOf(bushu));
                    }
                    if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                        new Zero().goUp(map);

                        showMyGame();
                        bushu++;
                        label_txt.setText("步数:"+String.valueOf(bushu));
                    }
                    if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                        new Zero().goLeft(map);

                        showMyGame();
                        bushu++;
                        label_txt.setText("步数:"+String.valueOf(bushu));
                    }

                //对两个矩阵进行比较 然后输出
                    for (int i = 0; i < map.length; i++) {
                        for (int j = 0; j < map[i].length; j++) {
                            if (map[i][j] == map2[i][j]) {
                                //对应一块加一
                                gameOver++;
//                                System.out.println(gameOver);
                            }else {
                                gameOver = 0;
                            }
                        }
                    }
                    //12块都对应即可通关
                    if (gameOver == 12) {
                        JOptionPane.showMessageDialog(myPanel, "恭喜你通关了！");
                        System.exit(0);
                    }
            }
        });
    }

    //    为了使程序结构清晰，设置一个方法来显示所有组件showMyGame()
    void showMyGame(){
        //移动矩阵
        for (int row = 0; row < map.length; row++) {
            for (int column = 0; column < map[0].length; column++) {
                label_list.add(new JLabel());
                java.net.URL imgURL = App.class.getResource("img/dj_"+
                        String.valueOf(map[row][column])+".png");
                label_list.get(row*3+column).setIcon(new ImageIcon(imgURL));
                label_list.get(row*3+column).setBounds(column*cell,row*cell,cell,cell);
                myPanel.add(label_list.get(row*3+column));
                myPanel.repaint();
            }
        }
    }

    //显示窗体方法
    void go(){

        label_txt.setText("步数：0");
        label_txt.setBounds(30,0,50,30);
        Font font=new Font("宋体", Font.BOLD,20);
        myPanel.add(label_txt);

        myPanel.setLayout(null);
        JFrame frame = new JFrame("拼图小游戏");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400,150,384,530);
        //frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);//禁止用户修改大小
        myPanel.setFocusable(true);//键盘监听必须加panel面板的焦点
    }
    public static void main(String[] args) {
        new App().go();
    }
}
