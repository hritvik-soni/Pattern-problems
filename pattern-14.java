import java.util.*;
class pattern14 {
    public static void main(String[] args) {
         Scanner s= new Scanner(System.in);
         int n = s.nextInt();
         int star =1;
         int space=n-1;
         for(int i=0;i<n;i++){

            for(int j=0;j<space;j++){
               System.out.print(" ");
            }

             for(int j=0;j<star;j++){
               System.out.print("*");
              
            }
         space--;
         star++;
         System.out.println();
         }
          star =n-1;
          space=1;
         for(int i=0;i<n;i++){

            for(int j=0;j<space;j++){
               System.out.print(" ");
            }

             for(int j=0;j<star;j++){
               System.out.print("*");
              
            }
         space++;
         star--;
         System.out.println();
         }
           s.close();
    }
}
