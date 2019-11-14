import java.util.*;

public class arrsot {
    public static void main(String[] args) {
        //Scanner c = new Scanner(System.in);
       arrsot b = new arrsot();
        b.cbbc();


    }
    public void cbbc(){
        int [] a = new int[]{1,24,5,68,4,3,8,9,67,88};
        Arrays.sort(a);
       try{ for(int i = 0;i<=a.length;i++) {
           System.out.println(a[i] + ",");
       }
        }catch(Exception e){
           e.getMessage();
       }
    }

}
