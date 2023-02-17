import java.util.*;
public class pos_neg
{
public static void main(String[] args)
{
int num; // Declaration of a Variable.
Scanner sc = new Scanner(System.in); // Creation of Scanner class
Object to read a Value from the User.
System.out.println("Enter a Non - Zero Number to Check for Positive
or Negative"); //User Message
num=sc.nextInt(); //Scanner class object helps to read an Integer
Number.
/*
if(num==0)
System.out.println("Invaid Number - Zero Valued");
else if(num>0)
System.out.println(num+" is Positive Number");
else
System.out.println(num+" is Negative Number"); */
if(num>0)
System.out.println(num+" is Positive Number");
else
System.out.println(num+" is Negative Number");
}
}
Sample Output