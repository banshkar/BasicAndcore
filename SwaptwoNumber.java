import java.util.Scanner;
public class SwaptwoNumber {
    public static void main(String[] args) {
        int a ,b ,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        a = sc.nextInt();
        System.out.println("Enter second Number");
        b = sc.nextInt();
        System.out.println("\n Before a :"+a +" b :" +b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("\nafter a: "+a+ " b :" +b);
    }
}
