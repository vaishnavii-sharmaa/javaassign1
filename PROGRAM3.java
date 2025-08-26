import java.util.*;
public class PROGRAM3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string: ");
        String s = sc.nextLine();
        int len=s.lastIndexOf("");
        System.out.println("the length of the string is: " + len);

    }
    
}
