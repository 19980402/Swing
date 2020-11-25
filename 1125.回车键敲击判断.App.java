import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JTextArea textArea_A=new JTextArea();
    JTextArea textArea_B=new JTextArea();
    //构造方法
    public App() {
        textArea_A.setText("猜一猜？");
        textArea_A.setBounds(100,100,256,128);
        textArea_A.setBackground(Color.orange);
        myPanel.add(textArea_A);
        textArea_B.setBounds(100,300,256,128);
        textArea_B.setBackground(Color.yellow);
        myPanel.add(textArea_B);
        textArea_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if(textArea_A.getText().equals("1")){
                        textArea_B.append("猜对了！\n");
                    }else{
                        textArea_B.append("错了！\n");
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_UP){
                    textArea_B.append("");
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN){
                    textArea_A.setText("");
                    textArea_B.setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN){
                    textArea_A.setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_UP){
                    textArea_B.append("");
                }

            }
        });
    }
    //显示窗体方法
    void go(){
        JFrame frame = new JFrame("TestGUI");
        myPanel.setLayout(null);
        myPanel.add(label_txt);
        myPanel.add(textArea_A);
        myPanel.add(textArea_B);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
