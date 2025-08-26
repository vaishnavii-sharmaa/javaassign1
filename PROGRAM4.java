import java.util.*;
public class PROGRAM4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter your string: ");
       String s= sc.nextLine().toLowerCase();
       int i =0 , j=s.length()-1;
       boolean ispalindrome=true;
       while(i<j){
          if(s.charAt(i)!=s.charAt(j)){
               ispalindrome=false;
          }
          i++;
          j--;
       }
       if(ispalindrome==true){
            System.out.println("yes the given string is a palindrome");
       }else{
        System.out.println("the given string is not a palindrome");
       }

    }
    
}
