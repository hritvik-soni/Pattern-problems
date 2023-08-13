 import java.util.*;

 class pattern2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
         int n = s.nextInt();
         int star =1;
         for(int i=0;i<n;i++){
             for(int j=0;j<star;j++){
               System.out.print("* ");
         }
         star++;
         System.out.println();
        }
    }
}
