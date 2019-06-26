import java.util.Scanner;
 
public class homeTask2Ex1_15_a {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.print("¬ведите значение x ");
        int x = in.nextInt();
        double b= (-1)/Math.pow(x,2); 
        System.out.print("b= "+b);
        in.close();
    }
}

   



