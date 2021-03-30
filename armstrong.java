class armstrong{
public static void main(String args[]){
int r,temp;
int n=123;
int c=0;
 temp=n;
while(n>0){
r=n%10;
c=c+(r*r*r);
n=n/10;
}
if(temp==c)
System.out.println("the given number is armstrong no");
else
System.out.println("the given number is not armstrong no");
}
}

