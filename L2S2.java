import java.util.Scanner;
public class L2S2{
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(n<2){
            System.out.println("Invalid Element");
        }
        else{
            int firstMin=Integer.MAX_VALUE, secondMin=Integer.MAX_VALUE;
            int firstMax=Integer.MIN_VALUE, secondMax=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(arr[i]<firstMin){
                    secondMin=firstMin;
                    firstMin=arr[i];
                }
                else if(arr[i]<secondMin&&arr[i]!=firstMin){
                    secondMin=arr[i];
                }
                if(arr[i]>firstMax){
                    secondMax=firstMax;
                    firstMax=arr[i];
                }
                else if(arr[i]>secondMax && arr[i]!=firstMax){
                    secondMax=arr[i];
                }
            }
            System.out.println("Smallest: " + firstMin + ", " + secondMin);
            System.out.println("Largest: " + firstMax + ", " + secondMax);
            sc.close();
        }
    }
}