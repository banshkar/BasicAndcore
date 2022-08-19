import java.util.Scanner;

public class ThreeNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number_1");
        int Number_1=sc.nextInt();
        System.out.println("Enter Number_2");
        int Number_2=sc.nextInt();
        System.out.println("Enter Number_3");
        int Number_3=sc.nextInt();
        if(Number_1>Number_2 && Number_1>Number_3){
            System.out.println("Greater Number is: "+Number_1);
        } else if (Number_2>Number_1 &&Number_2>Number_3){
            System.out.println("Greater Number is: " +Number_2);
        } else if (Number_1==Number_2 && Number_1==Number_3){
            System.out.println("All NUmber is Equal");
        }
        else {
            System.out.println("Greater Number is: " +Number_3);
        }
    }
}
