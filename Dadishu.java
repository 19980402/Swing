import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App {
    private JPanel Mypanel = new JPanel();
    private JLabel label_mouse = new JLabel();
    private JLabel label_bg = new JLabel();
    private JLabel label_num = new JLabel();
    int i =0;
    public App() {

        label_mouse.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label_mouse.setBounds((int)(Math.random()*10%10*50),(int)(Math.random()*10%10*50),51,47);
                i++;
                label_num.setText("You Score:"+String.valueOf(i));
            }
        });
    }

    void go(){
        Mypanel.setLayout(null);
        java.net.URL imgURL1 = App.class.getResource("shu.gif");
        java.net.URL imgURL2 = App.class.getResource("background.jpg");
        label_mouse.setIcon(new ImageIcon(imgURL1));
        label_bg.setIcon(new ImageIcon(imgURL2));
        label_mouse.setBounds(100,100,51,47);
        label_bg.setSize(1024,1024);
        label_num.setBounds(50,50,200,200);
        label_num.setFont(new Font("Arial",Font.BOLD,30));
        label_num.setForeground(Color.green);
        Mypanel.add(label_num);
        Mypanel.add(label_mouse);
        Mypanel.add(label_bg);

        JFrame frame = new JFrame("地鼠王子");
        frame.setContentPane(Mypanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1024,1024);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new App().go();
    }
}
