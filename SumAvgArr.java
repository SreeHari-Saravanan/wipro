import java.util.Scanner;
public class SumAvgArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size == ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        float sum=0;
        double avg=0;
        System.out.print("Enter the array value --> ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
            avg=sum/size;
        }
        System.out.println("Sum of array = "+sum);
        System.out.println("Average of the array = "+avg);
        sc.close();
    }
}