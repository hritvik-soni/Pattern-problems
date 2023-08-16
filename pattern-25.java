import java.util.*;
class pattern25 {
    public static void main(String[] args) {
         Scanner s= new Scanner(System.in);
         int n = s.nextInt();
         int star =1;
         int space=n-1;
         int p=1;
         for(int i=0;i<n;i++){

            for(int j=0;j<space;j++){
               System.out.print("  ");
            }

             for(int j=0;j<star;j++){
               System.out.print(p+" ");
               p++;
            }
         space--;
         star+=2;
         System.out.println();
         }
           s.close();
    }
}
