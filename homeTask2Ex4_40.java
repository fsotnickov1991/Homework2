import java.util.Scanner;
 
public class homeTask2Ex4_40 {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение переменной x");
        double x = in.nextDouble();
	
    
	if (x>=-2.4 & x<=5.7)
 {
       
       double f = Math.pow(x,2);
        System.out.print(f);
}
	
	else
{
       
	int f=4;
       
        System.out.print(f);
}
	
        in.close();
    }
}

   

         