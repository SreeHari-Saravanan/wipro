import java.util.Scanner;
public class SumFor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int digit=0;
        int sum=1;
        for(int i=0;i<=num;i++){
            digit=num%10;
            sum+=digit;
            num/=10;
        }
        System.out.println(sum);
        sc.close();
    }
}