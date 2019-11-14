import java.util.*;

public class daxiap {
    static int numbuer=0,letter = 0 ,nul = 0,outher=0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char [] c = s.toCharArray();

       try {
           for (int i = 0; i <= c.length; i++) {
               if (c[i] >= 0 && c[i] <= 9) {
                   numbuer++;
               } else if ((c[i] >= 'a' && c[i] <= 'z') || (c[i] >= 'A' && c[i] <= 'Z')) {
                   letter++;
               } else if (c[i] == ' ') {
                   nul++;
               } else {
                   outher++;
               }

           }
       }catch (Exception e){
           e.getMessage();
       }
        System.out.println("字母个数"+letter);
        System.out.println("数字个数"+numbuer);
        System.out.println("空格个数"+nul);
        System.out.println("其他字符个数"+outher);

    }

}
