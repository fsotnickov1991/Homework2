import java.util.Scanner;
 
public class homeTask2Ex1_15_д {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.println("¬ведите значение a ");
        double a = in.nextDouble();
	System.out.println("¬ведите значение b ");
        double b = in.nextDouble();
	
       
       	double c= 5.45*((a+2*b)/(2-a)); 
        System.out.print("c= "+c);
        in.close();
    }
}

   

         