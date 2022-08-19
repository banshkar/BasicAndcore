import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number =sc.nextInt();
        if(Number%2==0){
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Zero");
        }
    }
}
