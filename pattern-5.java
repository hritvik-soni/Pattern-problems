import java.util.*;
class pattern5 {
    public static void main(String[] args) {
         Scanner s= new Scanner(System.in);
         int n = s.nextInt();
         int star =n;
         int space=0;
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
