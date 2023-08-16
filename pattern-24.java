import java.util.*;
class pattern24 {
    public static void main(String[] args) {
         Scanner s= new Scanner(System.in);
         int n = s.nextInt();
         int star =1;
         int space=n-1;
         for(int i=0;i<n;i++){

            for(int j=0;j<space;j++){
               System.out.print("  ");
            }

             for(int j=0;j<star;j++){
               System.out.print(i+1+" ");
            }
         space--;
         star+=2;
         System.out.println();
         }
           s.close();
    }
}
