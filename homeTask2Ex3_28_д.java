import java.util.Scanner;
 
public class homeTask2Ex3_28_д {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение переменной A");
        double A = in.nextDouble();
	System.out.println("Введите значение переменной B");
        double B = in.nextDouble();
System.out.println("Введите значение переменной C");
        double C = in.nextDouble();
	if (((A<50)&(B>=50)&(C>=50))|((A>=50)&(B<50)&(C>=50))|((A>=50)&(B<50)&(C<50)))
 {
       
       
        System.out.println("Только одно из чисел меньше 50");
}
	
	
        in.close();
    }
}

   

       
        System.out.println("Хотя бы одно число отрицательно");
}
	
	
        in.close();
    }
}
         