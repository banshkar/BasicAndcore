import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char character= sc.nextLine().charAt(0);
        if(character=='a'||character=='i'||character=='o' || character=='u' ||character=='e' ||character=='A'
        ||character=='I'||character=='E' ||character=='O'||character=='U'){
            System.out.println("This Vowel");}
        else if (character >= 'a' && character<='z' ||character>='A'&&character<='Z'){
            System.out.println("this is Consonant");
        }
        else {
            System.out.println("this is not vowel or Consonant");
        }
    }
}
