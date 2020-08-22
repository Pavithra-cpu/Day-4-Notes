
class Car1
{
void run()
{
System.out.println("running");
}
}

class swift extends Car1
{
void run()
{
System.out.println("Car is running");
}

public static void main(String[] args)
{
swift s=new swift();
s.run();
}
}