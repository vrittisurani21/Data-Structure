import java.util.Scanner;
import java.util.Stack;
public class Lab8_4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String infix = sc.next();
        System.out.println("PreFix Evaluation:" + preeval(infix));
    }
    static int preeval(String infix){
        Stack<Integer> s = new Stack<>();
        for(int i=infix.length()-1;i>=0;i--){
            char temp = infix.charAt(i);
            if(Character.isDigit(temp)){
                s.push(Integer.parseInt(String.valueOf(temp)));
            }
            else{
                int op1 = s.pop();
                int op2 = s.pop();
                switch(temp){
                    case'+':{
                        s.push(op1 + op2);
                        break;
                    }
                    case'-':{
                        s.push(op1 - op2);
                        break;
                    }
                    case'*':{
                        s.push(op1 * op2);
                        break;
                    }
                    case'/':{
                        s.push(op1 / op2);
                        break;
                    }
                    
                }
            }
        }
        return(s.pop());
    }
}