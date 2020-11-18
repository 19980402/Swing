package demo;

import javax.swing.*;

public class App {
    private JPanel Mypanel;
    void go(){
        JFrame frame = new JFrame("打工人");
        frame.setContentPane(Mypanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(1000,500,300,500);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
       new App().go();
    }
}
