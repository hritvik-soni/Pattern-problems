
import java.util.*;
class pattern28 {
    public static void main(String[] args) {
         Scanner s= new Scanner(System.in);
         int n = s.nextInt();
         int star =1;
         int space=n-1;
         
         for(int i=0;i<n;i++){

            for(int j=0;j<space;j++){
               System.out.print("  ");
            }
             int p=i+1;
             for(int j=0;j<star;j++){
               System.out.print(p+" ");
               if(j<star/2){
                 p++;
               }
               else{
                  p--;
               }
              
            }
         space--;
         star+=2;
         System.out.println();
         }
           s.close();
    }
}
