import java.util.*;

public class Zh {
    public static void main(String[] args) {
        System.out.println("请输入一串字符");
        Scanner sda = new Scanner(System.in);
        String str1 = sda.nextLine();
        System.out.println(changers(str1));
    }
   public static String changers(String str){
        char [] ch = str.toCharArray();
        int value = 'a'-'A';

        for(int i = 0;i<ch.length;i++){
            if(ch[i]>='a'&&ch[i]<='z'){
                ch[i]=(char)(ch[i]-value);
            }else if(ch[i]>='A'&&ch[i]<='Z'){
                ch[i] = (char)(ch[i]+value );
            }
        }
        String last = new String(ch);
        return last;

   }

}

