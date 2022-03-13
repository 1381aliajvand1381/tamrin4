import java.util.Scanner;
public class T1_1 {
    public static void main(String args[]) {
        System.out.print("enter you want have how account?\t");
        
        int how_many=(new Scanner(System.in)).nextInt();//تعداد کار بران
        /////////////////////////اسم لیست ها
        String[] name=new String[how_many];
        String[] family=new String[how_many];
        int[] age=new int[how_many];
        ////////////////////////////////ثبت اطلاعات
        int i=0;
        while(i<how_many){
            System.out.print("enter your name\t");
            name[i]=(new Scanner(System.in)).nextLine();
            System.out.print("enter your last name\t");
            family[i]=(new Scanner(System.in)).nextLine();
            System.out.print("enter your age\t");
            age[i]=(int)(new Scanner(System.in)).nextInt();
            ///////////////////////////ببینی یکی هست کاربرا یا نه
            for(int j=0;j<i;j++){
                if(name[i]==name[j]){
                    if(family[i]==family[j]){
                        if(age[i]==age[j]){
                    System.out.println("error.user is valid");
                        }
                    }
                    i--;
                    break;
                }

            }
            i++;
        }
        for(i=0;i<how_many;i++){
        System.out.println(name[i]);
        System.out.println(family[i]);
        System.out.println(age[i]);
        }
    }}