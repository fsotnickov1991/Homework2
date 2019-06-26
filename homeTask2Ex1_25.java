import java.util.Scanner;
 
public class homeTask2Ex1_25 {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение стороны квадрата a");
        double a = in.nextDouble();
	
	
       
       	double b= a*4;
        System.out.print("Периметр квадрата = "+b);
        in.close();
    }
}

   

         