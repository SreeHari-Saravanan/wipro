import java.util.Scanner;
public class Upp2Low {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if((ch>='a' && ch<='z')){
            System.out.println(Character.toUpperCase(ch));
        }
        else if((ch>='A' && ch<='Z')){
            System.out.println(Character.toLowerCase(ch));
        }
        sc.close();
    }
}