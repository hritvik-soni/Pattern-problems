import java.util.*;
class pattern6 {
    public static void main(String[] args) {
         Scanner s= new Scanner(System.in);
         int n = s.nextInt();
        
         
         for(int i=1;i<=n;i++){

           for(int j=1;j<=(i-1)*2;j++){
               System.out.print("  ");
            }

             for(int j=i;j<=n;j++){
               System.out.print("* ");
              
            }
           
         System.out.println();
         }
           s.close();
    }
}
