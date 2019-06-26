import java.util.Scanner;
 
public class homeTask2Ex1_15_б {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.println("¬ведите значение a ");
        double a = in.nextDouble();
	System.out.println("¬ведите значение b ");
        double b = in.nextDouble();
	System.out.println("¬ведите значение c ");
        double c = in.nextDouble();
       	double d= a/(b*c); 
        System.out.print("d= "+d);
        in.close();
    }
}

   