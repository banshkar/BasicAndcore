import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        int x,y;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter value x and y :");
        x = sc.nextInt();
        y = sc.nextInt();
         double distance=Math.sqrt(x*x+y*y);
        System.out.println("distance from (x,y) to origin(0,0)" +distance);
    }
}
