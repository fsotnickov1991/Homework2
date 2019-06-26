import java.util.Scanner;
 
public class homeTask2Ex1_33 {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение количества жителей в государстве");
        double a = in.nextDouble();
	System.out.println("Введите значение площади территории государства");
        double b = in.nextDouble();
	
       
       	double c= a/b;
        System.out.print("Плотность населения государства = "+c);
        in.close();
    }
}

   

         