import java.util.Scanner;
 
public class homeTask2Ex1_15_� {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.println("������� �������� m ");
        double m = in.nextDouble();
	System.out.println("������� �������� n ");
        double n = in.nextDouble();
	
       
       	double d= Math.pow((Math.pow (2,m)),n); 
        System.out.print("d= "+d);
        in.close();
    }
}

   

         