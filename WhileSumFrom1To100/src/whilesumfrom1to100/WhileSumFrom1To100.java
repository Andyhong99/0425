
package whilesumfrom1to100;
public class WhileSumFrom1To100 {

    public static void main(String[] args) {
       int sum = 0;
       int i=1;
       
       while(i<=100){
      i++;
       sum+=i;
       }
        System.out.println("Sum from" + "1" + "to" + (i-1) + ":" + sum );
        
    }
    
}
