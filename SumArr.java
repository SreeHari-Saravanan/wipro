import java.util.Scanner;
class SumArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        int sum=0;
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<num;i++){
            sum+=arr[i];
        }
        System.out.print(sum);
        sc.close();
    }
}