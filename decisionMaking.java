import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        
    //if-else
      int age;
      System.out.print("Enter Your age : ");
      Scanner sc=new Scanner(System.in);
      age=sc.nextInt();
      if(age>=18){
          System.out.println("You are Eligible to Vote");
      }
      else{
          System.out.println("You are NOT Eligible to Vote");
      }
      
    //if-else ladder
      int marks;
      System.out.print("Enter Your Marks : ");
      marks=sc.nextInt();
      if(marks>=90 && marks<=100){
          System.out.println("O Grade");
      }else if(marks>=80 && marks<90){
          System.out.println("A Grade");
      }else if(marks>=70 && marks<80){
          System.out.println("B Grade");
      }else{
          System.out.println("Your are FAIL");
      }
      
      
      //Switch-Case 
     
      int num1,num2;
      System.out.print("Enter  First Number : ");
      num1=sc.nextInt();
      System.out.print("Enter Second Number : ");
      num2=sc.nextInt();
      System.out.print("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\nEnter Your Choice : ");
      int choice=sc.nextInt();
      switch(choice){
          case 1:
          System.out.println("Addition of two numbers is "+(num1+num2));
          break;
          case 2:
          System.out.println("Subtraction of two numbers is "+(num1-num2));
          break;
          case 3:
          System.out.println("Multiplication of two numbers is "+(num1*num2));
          break;
          case 4:
          System.out.println("Division of two numbers is "+(num1/num2));
          break;
          default:
          System.out.println("Invalid Choice");
      }
     
    }
}
