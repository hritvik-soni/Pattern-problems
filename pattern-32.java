 import java.util.*;

 class pattern32 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
         int n = s.nextInt();
         int p=1;
          
        int star =1;
         for(int i=0;i<n*2-1;i++){
             for(int j=0;j<star*2-1;j++){
                if(j%2==0){
                   System.out.print(p+" "); 
                  
                }
                else{
                 System.out.print("* ");
                }
              
         }
          if(i<n-1){
            
             star++;
             p++;
            }
            else{
            
             star--; 
             p--;
            }
       
         System.out.println();
        }

           s.close();
    }
}
