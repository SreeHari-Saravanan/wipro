import java.util.Scanner;
public class Datatype {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
            System.out.println("Alphabet");
        }
        else if((ch>='0' && ch<='9')||(ch>='A' && ch<='Z')){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special Character");
        }
        sc.close();
    }   
}