import java.util.Scanner;
 
public class homeTask2Ex4_21 {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.println("¬ведите значение переменной a");
        double a = in.nextDouble();
	
       System.out.println("¬ведите значение переменной b");
        double b = in.nextDouble();
	if (b%a==0)
 {
       
       
        System.out.print("a €вл€етс€ делителем b");
}
	
	else
{
       
       
        System.out.print("a не €вл€етс€ делителем b");
}
	
        in.close();
    }
}

   

         