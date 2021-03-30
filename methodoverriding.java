class human{
private void eat()
{
System.out.println("human is eating");
}
}
class boy extends human
{
public void eat(){
System.out.println("boy is eating");
}
public static void main(String[] args){
boy obj=new boy();
obj.eat();
}
}


