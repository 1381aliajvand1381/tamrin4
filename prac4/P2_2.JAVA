import java.util.Scanner;

public class P2_2{
    

    public static void main(String args[]) {
        System.out.println("\t\t\t\tax^2+bx+c=0");
        int a, b, c;
        double res, s;
        a = (new Scanner(System.in)).nextInt();
        b = (new Scanner(System.in)).nextInt();
        c = (new Scanner(System.in)).nextInt();
        res = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        s = (b - res) / (2 * a);
        System.out.println(s);
        System.out.print((b + res) / (2 * a));
    }

}
