import java.util.Scanner;
public class ThreexThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] a=new int[3][3];
        int max=Integer.MIN_VALUE;
        System.out.println("Enter matrix:");
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++) {
                a[i][j]=sc.nextInt();
                if(a[i][j]>max)
                    max=a[i][j];
            }
        System.out.println("Array:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                System.out.print(a[i][j] + " ");
                System.out.println();
        }
        System.out.println("Biggest number: " + max);
        sc.close();
    }
}