public class PrimeFor {
    public static void main(String[] args) {
        int i;
        int factor=0;
        for(i=10;i<=99;i++){
            factor=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                factor++;
            }
        }
            if(factor==2){
                System.out.println(i);
            }
        }
    }   
}