import java.util.Scanner;
public class FlipCoins {
    public static void main(String[] args) {
        int head =0;
        int tail =0;
        double random =0.0;
        int count =1;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number :");
        int flip =sc.nextInt();
        while (count<=flip){
            random = Math.random();
            if(random<0.5){
                head++;
                System.out.println("head");
            }
            else {
                tail++;
                System.out.println("tail");
            }
            count++;
        }
        System.out.println("Number of head :"+head);
        System.out.println("Number of tail :"+tail);
        double headPercentage=(double) head/flip*100;
        double tailPercentage=(double) tail/flip*100;
        System.out.println("...........");
        System.out.println("The percentage of head: "+headPercentage);
        System.out.println("The percentage of head: "+tailPercentage);
    }
}
