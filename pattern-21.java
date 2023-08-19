
import java.util.*;
class pattern21 {
    public static void main(String[] args) {
         Scanner s= new Scanner(System.in);
         int n = s.nextInt();
         int star =1;
         int space=n-1;


         for(int i=1;i<=n/2+1;i++){

            if(i==n/2+1){

               for(int j=1;j<=n;j++){
                System.out.print("* ");
              }
            }

            else{

           
           for(int j=1;j<=star;j++){
                System.out.print("* ");
            }
            for(int j=1;j<space;j++){
                System.out.print("  ");
            }
              for(int j=1;j<=star;j++){
                System.out.print("* ");
            }
          
               star++;
               space-=2;
          
        }
      System.out.println();
    }
            
           s.close();
    }
}
