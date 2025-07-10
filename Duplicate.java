import java.util.Scanner;
public class Duplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); // No of elements
        int[] arr=new int[n];
        
        // Read input
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }

        // Print unique elements
        for (int i=0;i<n;i++) {
            boolean isDuplicate=false;
            
            // Check if appeared in previous
            for (int j=0;j<i;j++) {
                if (arr[i]==arr[j]) {
                    isDuplicate=true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}
