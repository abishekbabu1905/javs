import java.util.Scanner;
public class demo1 {
    public static void main(String args[])
    {
        String red = "red";
        String yellow = "yellow";
        String green="green";
        Scanner scan = new Scanner(System.in);
        String s1=scan.nextLine();
        if (s1.equals(red)) {
            System.out.println("Stop");
            
        }
        else if (s1.equals(yellow)) {
            System.out.println("ready");
        }
        else if(s1.equals(green))
            System.out.println(" goo");
        }

    }

