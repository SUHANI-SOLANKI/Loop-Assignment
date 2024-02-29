import java.util.*;
public class Greatest_Common_Divisor   {  
public static void main(String[] args) {  
Scanner sc = new Scanner(System.in);
System.out.print("enter the first number :  ");
int num1 = sc.nextInt();
System.out.print("enter the first number :  ");
int num2 = sc.nextInt();
int gcd = 0;

for(int i=1;  ((i<=num1) && (i <= num2)); i++)  {  
    if(num1%i==0 && num2%i==0)
gcd = i;  }  
System.out.printf("GCD of %d and %d is: %d", num1, num2, gcd);  
}  
}  