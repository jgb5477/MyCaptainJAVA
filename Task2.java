import java.util.Scanner;

public class HelloWorld{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Minutes : ");
        int min=sc.nextInt();
        int years=min/(365*24*60);
        int temp=min%(365*24*60);
        int days=temp/(24*60);
        System.out.println(min+" minutes is approximately "+years+" years and "+days+" days. ");
     }
}
