import java.util.Scanner;
 
public class homeTask2Ex3_28_б {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.println("¬ведите значение переменной A");
        double A = in.nextDouble();
	System.out.println("¬ведите значение переменной B");
        double B = in.nextDouble();
	if ((A%2==0 & B%2!=0)|(A%2!=0 & B%2==0)) {
       
       
        System.out.println("ќдно из чисел A или B четное");
}
	
	
        in.close();
    }
}

   

         