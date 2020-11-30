public class R extends App {
    public static void main(String[] args) {
        R i=new R();
        System.out.println(i.boy_filePath+"\n"+i.girl_filePath);
        for(int k=0;k<i.array2d[0].length;k++){
            for(int j=0;j<i.array2d[0].length;j++){
                System.out.println(i.array2d[k][j]+",");
            }
            System.out.println();
        }
    }
}
