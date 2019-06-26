import java.util.Scanner;
 
public class homeTask2Ex1_22_а {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.println("¬ведите значение x ");
        double x = in.nextDouble();
	
	
       
       	double y= 7*(Math.pow(x,2))-3*x+6; 
        System.out.print("y= "+y);
        in.close();
    }
}

   

         