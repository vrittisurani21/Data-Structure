import java.util.Scanner; 
public class Lab3_2 { 

    public static void main(String[] args) 
    { 
    
        Scanner sc =new Scanner(System.in);
        int m =sc.nextInt();
        int n =sc.nextInt();
        int Sum =0;
         if(m<n){
            for(int i=m;i<n;i++){
                Sum=n+i;
            }
            System.out.println(Sum);

         }  
      
        } 
    }