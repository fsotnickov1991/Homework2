import java.util.Scanner;
 
public class homeTask2Ex4_1 {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение переменной x");
        double x = in.nextDouble();
	
       
	if (x>0)
 {
       
       double y = Math.pow(Math.sin(x),2);
        System.out.print(y);
}
	
	else
{
       
       double y = 1-2*(Math.sin(Math.pow(x,2)));
        System.out.print(y);
}
	
        in.close();
    }
}

   

         