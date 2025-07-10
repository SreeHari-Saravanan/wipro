import java.util.Scanner;
public class Interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter gender : ");
        String gender=sc.next();
        System.out.print("Enter age : ");
        int age=sc.nextInt();
        double percent;

        if((gender.equals("Male"))&&(age>0 && age<=58)){
            percent=0.84*10;
            System.out.println("The percent is "+percent+"%");
        }
        else if((gender.equals("Male"))&&(age>=59 && age<=100)){
            percent=0.105*100;
            System.out.println("The percent is "+percent+"%");
        }
        else if((gender.equals("Female"))&&(age>0 && age<=58)){
            percent=0.82*10;
            System.out.println("The percent is "+percent+"%");
        }
        else if((gender.equals("Female"))&&(age>=59 && age<=100)){
            percent=0.92*10;
            System.out.println("The percent is "+percent+"%");
        }
        sc.close();
    }
}
