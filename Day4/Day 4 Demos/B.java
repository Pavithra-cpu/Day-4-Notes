class A
{
A get()
{
return this;
}
}

class B extends A
{
B get()
{
return this;
}
void message()
{
System.out.println("Covariant return type");
}
public static void main(String[] args)
{
new B().get().message();
}
}