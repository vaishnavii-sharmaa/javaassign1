import java.util.*;
public class PROGRAM5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string: ");
        String s = sc.nextLine();
        char result=0;
        for(int i =0;i<s.length();i++){
            char ch=s.charAt(i);
            if(s.indexOf(ch)==s.lastIndexOf(ch)){
                result=ch;
                break;
            }
        }
        if(result!=0){
            System.out.println("the first non repeating character is: " + result);
        }

    }

    
}
