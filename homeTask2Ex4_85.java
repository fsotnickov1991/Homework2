import java.util.Scanner;
 
public class homeTask2Ex4_85 {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение переменной x");
        double x = in.nextDouble();
	
    
	if (x<-1)
 {
       
       double y = -1;
        System.out.print(y);
}
	
	else if (x>-1)
{
       
	double y=x;
       
        System.out.print(y);
}
	else if (x==-1)
{
       
	double y=1;
       
        System.out.print(y);
}

        in.close();
    }
}

   

         