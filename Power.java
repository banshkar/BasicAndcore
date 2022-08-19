import java.util.Scanner;

public class Power{
    public static void main(String[] args) {
        double a,b,c ,delta,imagenary,root_1,root_2;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Value a,b,and c");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        delta =(b*b)-(4*c*c);
        if(delta>0){
            root_1 = (-b+Math.sqrt(delta)/(2*a));
            root_2 = (-b-Math.sqrt(delta)/(2*a));
            System.out.println("The Value root_1 is :" +root_1 );
            System.out.println("The Value root_2 is :" +root_2 );
        } else if (delta==0){
            root_1=root_2= -b/(2*a);
            System.out.println("The root_1 and root_2 is equal is" +root_1+"and "+root_2);
        }
        else {
            root_1=root_2 =-b/(2*a);
            imagenary=Math.sqrt(-delta)/(2*a);
            System.out.println("This is Imagenary Root:....");
            System.out.println("The value root_1 "  +root_1+" + "+imagenary);
            System.out.println("The value root_2 " +root_2+" - "+imagenary);
        }
    }
}
