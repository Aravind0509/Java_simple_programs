import java.util.*;
public class Arithmetic{
public static void main(String[] args)
{
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the no of times you want to perform operation");
int num=scanner.nextInt();
for(int i=1;i<=num;i++){
System.out.println("Enter the arithmetic operator");
System.out.println("+,*,/ or -");
char c;
c=scanner.next().charAt(0);
double d,e,add,mult,subt,div;
System.out.println("Enter two numbers:");
d=scanner.nextDouble();
e=scanner.nextDouble();
switch(c)
{
 case '+':
  add=d+e;
  System.out.println("Addition is:"+add);
  break;
 case '*':
  mult=d*e;
  System.out.println("Multiplication is:"+mult);
  break;
 case '/':
  div=d/e;
  System.out.println("Division is:"+div);
  break;
 case '-':
  subt=d-e;
  System.out.println("Subtraction is:"+subt);
  break;
 default:
 System.out.println("Enter the valid operator");
 break;
 }
 }
 }
 }
