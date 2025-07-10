import java.util.Scanner;
class Present{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5};
        System.out.print("Search: ");
        int num=sc.nextInt();
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                index=i;
                break;
            }
        }
        System.out.println("Index no is: "+index);
        sc.close();
    }
}