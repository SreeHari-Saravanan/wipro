import java.lang.System;
public class TwoString
{
	public static void main(String[] args) {
        if(args.length!=2){
            System.out.print("Please give two arguments");
            return;
        }
	    String company=args[0];;
	    String city=args[1];
	    System.out.println(company+" technology "+city);
	}
}