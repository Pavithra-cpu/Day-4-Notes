class Addition
{
static int add(int a,int b)
{
return a+b;
}
static int add(int a,int b,int c)
{
return a+b+c;
}

class testingAddition
{
public static void main(String[] args)
{
System.out.println(Addition.add(1,2));
System.out.println(Addition.add(1,2,3));
}
}
}