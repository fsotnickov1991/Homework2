import java.util.Scanner;
 
public class homeTask2Ex1_15_� {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.println("������� �������� a ");
        double a = in.nextDouble();
	System.out.println("������� �������� b ");
        double b = in.nextDouble();
	
       
       	double d= 1/(1+((a+b)/2)); 
        System.out.print("d= "+d);
        in.close();
    }
}

   

         