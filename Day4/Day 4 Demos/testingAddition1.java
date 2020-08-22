class Addition1
{
static int add(int a,int b)
{
return a+b;
}
//static double add(double a,double b)
static double add(int a,int b)
{
return a+b;
}
}

class testingAddition1
{
public static void main(String[] args)
{
System.out.println(Addition1.add(1,2));
//System.out.println(Addition1.add(11.3,34.7));
}
}
