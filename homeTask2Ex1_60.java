import java.util.Scanner;
 
public class homeTask2Ex1_60 {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение переменной a");
        double a = in.nextDouble();
	System.out.println("Введите значение переменной b");
        double b = in.nextDouble();
	System.out.println("Введите значение переменной c");
        double c = in.nextDouble();
       
       	b=c;
	a=b;
	c=a;
        System.out.println(a);
System.out.println(b);
System.out.println(c);
        in.close();
    }
}

   

         