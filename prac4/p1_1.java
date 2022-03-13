
import java.util.Scanner;
public class p1_1 {
    public static void main(String args[]) {
        String pasword, name_student;
        int code;
        pasword = "ali";
        name_student = "ali ajvand";
        code = 54051;

        System.out.print("enter your name in fild");

        String name = (new Scanner(System.in)).next();

        System.out.print("enter your pasword in fild");

        String pass = (new Scanner(System.in)).next();
        System.out.print("enter your number in fild");
        
         
        try {
            int mycode=(int)(new Scanner(System.in)).nextInt();
            if ((name != name_student) && (pass != pasword)&&(mycode!=code)) {
                System.out.print("eror in input data");
            }
        } catch (Exception e) {
            System.out.println("error");
        } 
    }
}

