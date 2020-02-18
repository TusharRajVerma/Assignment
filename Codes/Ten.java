class Ten
{
public static void add(int a,int b)
{
System.out.println(a+b);
}
public static void add(double a,double b)
{
System.out.println(a+b);
}
public static void mul(float a,float b)
{
System.out.println(a*b);
}
public static void mul(int a,int b)
{
System.out.println(a*b);
}
public static void str(String s1,String s2)
{
System.out.println(s1+s2);
}
public static void str(String s1,String s2,String s3)
{
System.out.println(s1+s2+s3);
}
public static void main(String[] args)
{
int i=2,j=3,k=4,l=5;
float a=3.4f,b=4.2f;
String st="Tus",st2="har",st3="raj";
double d=2.33,g=3.33;
add(i,j);
add(d,g);
mul(a,b);
mul(k,l);
str(st,st2);
str(st,st2,st3);
}
}
