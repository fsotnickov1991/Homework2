import java.util.Scanner;
 
public class homeTask2Ex1_15_� {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.println("������� �������� a ");
        double a = in.nextDouble();
	System.out.println("������� �������� b ");
        double b = in.nextDouble();
	System.out.println("������� �������� c ");
        double c = in.nextDouble();
       
       	double d= (-b+(Math.sqrt(Math.pow(b,2)-4*a*c)))/2*a; 
        System.out.print("d= "+d);
        in.close();
    }
}

   

         