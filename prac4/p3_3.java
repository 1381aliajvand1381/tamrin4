import java.util.Scanner;

public class p3_3 {
    public static void main(String args[]){
        String jomle=(new Scanner(System.in)).next();
        int[] adad=new int[10];
        int  a=1;
        for(int i=0;i<jomle.length();i++){
            if((jomle.codePointAt(i)>=48)&&(jomle.codePointAt(i)<=58)){
                a++;
                System.out.println("number is valid");
                break;
            }
            }
            if (a==1){
                System.out.println("number is invalid");
            }

            
    
}}
