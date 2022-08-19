
import java.util.Scanner;
public class Quotient {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enetr Divided Number");
        int Dividend =sc.nextInt();
        System.out.println("Enetr Divisor Number");
        int Divisor =sc.nextInt();
        int Quotent =Dividend/Divisor;
        int Remainder =Dividend%Divisor;
        System.out.println("Quitent:"+Quotent);
        System.out.println("Remainder:"+Remainder);
    }
}
