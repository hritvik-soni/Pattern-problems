import java.util.*;
class pattern20 {
    public static void main(String[] args) {
         Scanner s= new Scanner(System.in);
         int n = s.nextInt();
         int star =1;
         int space=n;
         for(int i=0;i<n;i++){

            for(int j=0;j<space;j++){
               System.out.print("  ");
            }

             for(int j=0;j<star;j++){
                if(j==0 || j==star-1){
               System.out.print("* ");
             }
             else{
                  System.out.print("  ");
             }
            }
            if(i<n/2){
             space--;
            star+=2;
            }
            else{
               space++;
              star-=2;
            }
         
         System.out.println();
         }
           s.close();
    }
}
