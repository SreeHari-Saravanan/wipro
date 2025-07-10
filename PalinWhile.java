import java.util.Scanner;

public class PalinWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int actual=num;  
        int reverse=0;

        while(num>0) {
            int digit= num % 10;           
            reverse=reverse*10+digit; 
            num/=10;                     
        }
        if (actual==reverse) {
            System.out.println(actual + " --> palindrome.");
        } else {
            System.out.println(actual + " --> not a palindrome.");
        }
        sc.close();
    }
}