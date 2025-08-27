import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
public class Datetime3 {
    public static void main(String args[]){
    LocalDate date = LocalDate.now();
        DateTimeFormatter myformat1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter myformat2=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter myformat3=DateTimeFormatter.ofPattern("EEEE,MMM,dd,yyyy");
        System.out.println("the first format: " + date.format(myformat1));
        System.out.println("the second format: " + date.format(myformat2));
        System.out.println("the third format: " + date.format(myformat3));
        
    }
    
}
