import java.util.*;
class pattern10 {
    public static void main(String[] args) {
         Scanner s= new Scanner(System.in);
         int n = s.nextInt();
         int star =n*2-1;
         int space=0;
         for(int i=0;i<n;i++){

            for(int j=0;j<space;j++){
               System.out.print(" ");
            }

             for(int j=0;j<star;j++){
      
               System.out.print("* ");}
             
         space+=2;
         star-=2;
         System.out.println();
         }
           s.close();
  }
}

