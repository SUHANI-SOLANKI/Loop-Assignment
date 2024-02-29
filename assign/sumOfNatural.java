import java.util.*;
class sumOfNatural{
    public static void main(String[] args){
    System.out.println("hello world");
    System.out.println("the sum of n natural numbers");
    // take the input from user
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the number : ");
    int num = sc.nextInt();
    int result = 0 ;   // for storing the sum of the numbers
    if(num>0) {
            for (int i = 1; i<=num; i++){
              result = result + i;
    }
            System.out.println("The sum of natural number are : " + result);        
    }
    else System.out.println("you entered negative number");
}
}