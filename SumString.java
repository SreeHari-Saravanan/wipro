import java.lang.System;
public class SumString {
    public static void main(String[] args) {
        if(args.length!=2){
            System.out.print("Please enter two command line arguments");
            return;
        }

        int num1=Integer.parseInt(args[0]);
        int num2=Integer.parseInt(args[1]);
        int result=num1+num2;
        System.out.println("The sum of "+num1+" and "+num2+" is "+result);
    }
}
