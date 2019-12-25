package studentdetails;
import java.util.Scanner;

public class Studentdetails {


    public static void main(String[] args)
   {
        Scanner in = new Scanner (System.in);
        Scanner input = new Scanner (System.in);
            System.out.println("     Welcome To Varendra University      ");
            System.out.println("        Please Enter Your Data      \n");
            System.out.println("Enter Your Name         : ");
            String name = in.nextLine();
            System.out.println("Enter Your ID           : ");
            int roll = in.nextInt();
            System.out.println("Enter Your CGPA         : ");
            double cgpa = in.nextDouble();
            System.out.println("Enter Your Department   : ");
            String deptm = input.nextLine();
            System.out.println("Enter Your Batch        : ");
            String batch = input.nextLine();
            System.out.println("Enter Your Semester     : ");
            String sem = input.nextLine();
            
            System.out.println("      Varendra University     ");
            System.out.println("        Student Profile     ");
            System.out.println("Name       : " +name);
            System.out.println("ID         : " +roll);
            System.out.println("CGPA       : " +cgpa);
            System.out.println("Department : " +deptm);
            System.out.println("Batch      : " +batch);
            System.out.println("Semester   : " +sem);
            
            
        
    }
    
}
