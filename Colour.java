import java.util.Scanner;
public class Colour {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter code : ");
        char code=sc.next().charAt(0);
        
        switch(code){
            case 'R':
                System.out.print("Red");
                break;
            case 'B':
                System.out.print("Blue");
                break;
            case 'G':
                System.out.print("Green");
                break;
            case 'O':
                System.out.print("Orange");
                break;
            case 'Y':
                System.out.print("Yellow");
                break;
            case 'W':
                System.out.print("White");
                break;
            default:
                System.out.print("Input not valid");
                break;
        }
        sc.close();
    }
}