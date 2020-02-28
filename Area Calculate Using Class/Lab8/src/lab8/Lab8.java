
package lab8;
import java.util.Scanner;

public class Lab8 {

 
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
       
        Area ob1= new Area();
        
        System.out.println("Enter Lentgh And Width Respectively");
        
        ob1.x = in.nextInt();
        ob1.y = in.nextInt();
        
        int result = ob1.calc();
        System.out.println("The Area Is : "+result);
        
    }
    
}
