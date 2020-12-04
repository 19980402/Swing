import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_back=new JLabel();
    JLabel label_source=new JLabel();
    int source,source1,source2,source3,source4,source5,source6,source7;
    int num,num1,num2,num3,num4,num5,num6;

    //构造方法
    public App() {
        label_source.setBounds(10,30,200,20);
        label_source.setFont(new Font(Font.DIALOG,Font.BOLD,18));
        java.net.URL img = App.class.getResource("images/123.jpg");
        label_back.setIcon(new ImageIcon(img));
        label_back.setBounds(0,0,1000,644);


        label_back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (e.getX()<758 && e.getX()>708 && e.getY()<582 && e.getY()>35){
                    source1 = 1;
                    source = source1+source2+source3+source4+source5+source6+source7;
                    label_source.setText(String.valueOf("当前分数为："+source));
                }
                if (e.getX()<957 && e.getX()>912 && e.getY()<607 && e.getY()>568){
                    source2 = 1;
                    source = source1+source2+source3+source4+source5+source6+source7;
                    label_source.setText(String.valueOf("当前分数为："+source));
                }
                if (e.getX()<859 && e.getX()>779 && e.getY()<482 && e.getY()>404){
                    source3 = 1;
                    source = source1+source2+source3+source4+source5+source6+source7;
                    label_source.setText(String.valueOf("当前分数为："+source));
                }
                if (e.getX()<788 && e.getX()>730 && e.getY()<258 && e.getY()>205){
                    source4 = 1;
                    source = source1+source2+source3+source4+source5+source6+source7;
                    label_source.setText(String.valueOf("当前分数为："+source));
                }
                if (e.getX()<598 && e.getX()>501 && e.getY()<145 && e.getY()>68){
                    source5 = 1;
                    source = source1+source2+source3+source4+source5+source6+source7;
                    label_source.setText(String.valueOf("当前分数为："+source));
                }
                if (e.getX()<666 && e.getX()>629 && e.getY()<521 && e.getY()>456){
                    source6 = 1;
                    source = source1+source2+source3+source4+source5+source6+source7;
                    label_source.setText(String.valueOf("当前分数为："+source));
                }
                if (e.getX()<980 && e.getX()>948 && e.getY()<455 && e.getY()>419){
                    source7 = 1;
                    source = source1+source2+source3+source4+source5+source6+source7;
                    label_source.setText(String.valueOf("当前分数为："+source));
                }
                //满分换图下一关
                if(source == 7){
                    java.net.URL imgs = App.class.getResource("images/aa.jpg");
                    label_back.setIcon(new ImageIcon(imgs));
                    label_back.setBounds(0,0,1000,644);
                    label_source.setText("0");
                }
                if(e.getX()<682 && e.getX()>604 && e.getY()<190 && e.getY()>141){
                    num1 = 1;
                    num = num1+num2+num3+num4+num5+num6;
                    label_source.setText(String.valueOf("当前分数为："+num));
                }
                if(e.getX()<926 && e.getX()>887 && e.getY()<224 && e.getY()>166){
                    num2 = 1;
                    num = num1+num2+num3+num4+num5+num6;
                    label_source.setText(String.valueOf("当前分数为："+num));
                }
                if(e.getX()<810 && e.getX()>757 && e.getY()<348 && e.getY()>303){
                    num3 = 1;
                    num = num1+num2+num3+num4+num5+num6;
                    label_source.setText(String.valueOf("当前分数为："+num));
                }
                if(e.getX()<914 && e.getX()>875 && e.getY()<414 && e.getY()>379){
                    num4 = 1;
                    num = num1+num2+num3+num4+num5+num6;
                    label_source.setText(String.valueOf("当前分数为："+num));
                }

                System.out.println("x:"+e.getX()+","+"y:"+e.getY());
            }
        });
    }

    //显示窗体方法
    void go(){
        JFrame frame = new JFrame("母鸡找茬母鸡母鸡鸡叽叽叽叽叽叽叽叽叽叽");
        myPanel.setLayout(null);
        myPanel.add(label_source);
        myPanel.add(label_back);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,685);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
