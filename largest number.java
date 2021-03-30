import java.util.Scanner;
class large{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
int n1 = sc.nextInt();
int n2=sc.nextInt();
int n3=sc.nextInt();
if (n1>n2 && n1>n3)
{
  System.out.println("print the result  is ="+n1);
}
else if (n2>n1 && n2>n3)
{
  System.out.println("print the result is="+n2);
}
else{
      System.out.println("print the result is="+n3);

}
}
}

