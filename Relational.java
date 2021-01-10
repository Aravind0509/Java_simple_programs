import java.util.*;
public class Relational{
public static void main(String[] args)
{
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the no of times you want to perform operation");
int num=scanner.nextInt();
for(int i=1;i<=num;i++){
 System.out.println("Enter the two nos");
 byte num1,num2;
 num1=scanner.nextByte();
  num2=scanner.nextByte();
  if(num1>num2){
  System.out.println(num1+" is greater than "+num2);
  }
  else if(num1<num2){
  System.out.println(num1+" is lesser than "+num2);
  }
  else{
  System.out.println(num1+" is equal to "+num2);
  }
 }
}
 }
