import java.util.*;

class pattern30 {
     public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
         int n = s.nextInt();
         for(int i=0;i<n;i++){
            int p=n;
            for(int j=0;j<n;j++){
             System.out.print(p+" ");
             p--;
         }
         System.out.println();
        }
          s.close();
     }
}