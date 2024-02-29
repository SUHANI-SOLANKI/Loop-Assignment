import java.util.*;
class TableOfNumber{
    public static void main(String[] args){
        System.out.println("hello world");
        //take the input from user
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the number : ");
        int num = sc.nextInt();
        System.out.println("the table of given number is : ");
        for(int i = 1; i<=10; i++){
            int result = num * i;
            System.out.println(num +" * "+ i + " = " + result);
        }
    }
}




