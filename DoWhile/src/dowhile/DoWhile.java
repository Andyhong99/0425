
package dowhile;
import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
      System.out.println("Enter the Message:");
        System.out.println("Press the Q exit the program");
        
        Scanner scanner = new Scanner(System.in);
        String inputString;
        
        do{
        System.out.print(">");
        inputString = scanner.nextLine();
        System.out.println(inputString);
        }
        while(! inputString.equals("q"));
        
        System.out.println();
        System.out.println("End program");
        
    }
    
}
