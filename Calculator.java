import java.util.*;

public class Calculator {
    public static void main(String[] args) throws Exception{
        Scanner scn=new Scanner(System.in);
        int a,b,c;

        System.out.println("*Calculator*");

        System.out.println("Give first input");
        a=scn.nextInt();

        System.out.println("Give second input");
        b=scn.nextInt();
        
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiply");
        System.out.println("4. Division");
        System.out.println("Choose operation");
        c=scn.nextInt();

        if(c>0&&c<5){
           if(c==1){
             System.out.print("Addition is:");
             Addition.add(a,b);
           }
           else if(c==2){
             System.out.print("Substraction is:");
             Substraction.substract(a,b);
           }
           else if(c==3){
             System.out.print("Multiplication is:");
             Multiplication.multiply(a,b);
           }
           else if(c==4){
             System.out.print("Division is:");
             Division.divide(a,b);
           }
        }else{
           System.out.println("Invalid Input");
        }

       scn.close();

    }
}