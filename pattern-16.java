import java.util.*;
class pattern16 {
    public static void main(String[] args) {
         Scanner s= new Scanner(System.in);
         int n = s.nextInt();
        int star=n;
        int space=2*n-1;
         
         for(int i=1;i<=n*2-1;i++){

           int currSpace=1;
           while(currSpace<=space){
            System.out.print("  ");
            currSpace++;
           }

            int currStar=1;
           while(currStar<=star){
            System.out.print(" *");
            currStar++;
           }

           if(i<n){
             space-=2;
             star--;
            }
            else{
             space+=2;
             star++; 
            }
           
         System.out.println();
         }
           s.close();
    }
}
