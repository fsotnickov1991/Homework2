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
       
       	double d= (-b+(1/a))/(2/c); 
        System.out.print("d= "+d);
        in.close();
    }
}

   

         