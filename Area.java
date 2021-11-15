class Area
{
static void triangle(int b,int h)
{
int a=(b*h)/2;
System.out.println("area is "+a);
}
static void circle(int r,float d)
{
float c=r *r *d;
System.out.println("area is "+c);
}
static void rectangle(int l,int b)
{
int a=l*b;
System.out.println("area  is"+a);
}
public static void main(String args[])
{
Area.triangle(3,4);
Area.circle(5 , 3.14f);
Area.rectangle(4,6);
}
}
