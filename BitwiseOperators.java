import java.util.*;
public class BitwiseOperators{
public static void main(String[] args)
{
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the no of times you want to perform operation"); 
int num=scanner.nextInt();
int i=1;
while(i<=num){
System.out.println("Enter the bitwise operator");
System.out.println("r(Bitwise shift right) or l(Bitwise shift left) or z(Bitwise shift right zero fill) or n(bitwise not)");
char f;
f=scanner.next().charAt(0);
System.out.println("Enter a number:");
int g=scanner.nextInt();
switch(f)
{
case 'r':
  System.out.println("Bitwise shift right :"+g+">>2="+(g>>2));
  break;
case 'l':
  System.out.println("Bitwise shift left :"+g+"<<2="+(g<<2));
  break;
case 'z':
  System.out.println("Bitwise shift right zero fill: "+g+">>>2="+(g>>>2));
  break;
case 'n':
    System.out.println("Bitwise not of "+g+":");
    System.out.println(~g);
    break;
default:
  System.out.println("Enter the valid operator");
  break;
 }
 i++;
 }
 }
 }
