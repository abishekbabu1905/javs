import java.util.Scanner;
public class ternary {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int num1 = scan.nextInt();
        System.out.println("Enter the 2nd number");
        int num2 = scan.nextInt();
       String result =  num1>num2?"num 1 is greater":"num 2 is greater";
       System.out.println(result);
    }
    
}
