import java.util.*;
public class PROGRAM8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string: ");
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int ascii= (int) ch;
            System.out.println(ch + "=" + ascii);
        }

    }
}
