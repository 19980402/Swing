import java.util.Scanner;

public class suiji {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while (true){
            int a=s.nextInt();
            int x=(int) (Math.random()*a*100%100);
            int y=(int) (Math.random()*a*100%100);
            System.out.println(x+","+y);
        }
    }
}
