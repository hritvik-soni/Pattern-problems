import java.util.*;
class pattern7 {
    public static void main(String[] args) {
         Scanner s= new Scanner(System.in);
         int n = s.nextInt();
        
         
         for(int i=1;i<=n;i++){

            if(i==1 || i== n){

                for(int j=1; j<=n;j++){
                    System.out.print("* ");
                }

            }
            else{
                System.out.print("* ");

                 for(int j=1; j<n-1;j++){
                    System.out.print("  ");
                }
                System.out.print("*");
            }
           
         System.out.println();
         }
           s.close();
    }
}
