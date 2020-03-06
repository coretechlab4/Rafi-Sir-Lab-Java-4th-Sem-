
package lab10;
import java.util.Scanner;

public class Lab10 {


    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        Cylinder ob = new Cylinder();
        
        System.out.println("1.Area    ");
        System.out.println("2.Volume  ");
        System.out.println("3.Cylinder Volume  ");
        System.out.println("Enter Your Choice : ");
        
        int choice =in.nextInt();
        
        if(choice==1)
        {
            System.out.println("Enter Length & Width : ");
            
            ob.length = in.nextDouble();
            ob.width  = in.nextDouble();
            
            System.out.println("The Area Is : "+ob.calcArea());
        }
        else if(choice==2)
        {
            System.out.println("Enter Height & Lenth & Width : ");
            
            ob.height = in.nextDouble();
            ob.length = in.nextDouble();
            ob.width  = in.nextDouble();
            
            System.out.println("The Volume Is : "+ob.calcVolume());
        }
        else if(choice==3) 
        {
            System.out.println("Enter Radius And Height : ");
            
            ob.radius = in.nextDouble();
            ob.height = in.nextDouble();
            
            System.out.println("The Cylinder Volume Is : "+ob.cylinderVolume());
            
        }
        else 
        {
            System.out.println("Invalid Input");
        }
    }
    
}
