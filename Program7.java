import java.util.*;
public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string: ");
        String s = sc.nextLine();
        String result=s.replace(' ', '-');
        System.out.println("the new string is: " + result);

    }
}
