import java.util.Scanner;
 
public class homeTask2Ex3_28_а {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.println("¬ведите значение переменной A");
        double A = in.nextDouble();
	System.out.println("¬ведите значение переменной B");
        double B = in.nextDouble();
	if (A>100 & B>100) {
       
       
        System.out.println("A и B больше 100");
}
	
	else {
       
       
        System.out.println("A и B меньше 100");
	}
        in.close();
    }
}

   

         