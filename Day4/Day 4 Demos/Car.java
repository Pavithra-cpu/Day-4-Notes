class Car
{
final void run()
{
System.out.println("running");
}
}

class swift extends Car
{
void run()
{
System.out.println("running safely");
}


public static void main(String[] args)
{
Car c=new Car();
c.run();
}
}