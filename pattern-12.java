import java.util.*;
class pattern12 {
    public static void main(String[] args) {
         Scanner s= new Scanner(System.in);
         int n = s.nextInt();
         int star =1;
         int space=n*2-1;
         for(int i=0;i<n;i++){

            for(int j=0;j<space;j++){
               System.out.print(" ");
            }

             for(int j=0;j<star;j++){
                if(j%2==0){
               System.out.print("* ");
               }
               else{
                 System.out.print("! ");
               }
            }
         space-=2;
         star+=2;
         System.out.println();
         }
           s.close();
    }
}
