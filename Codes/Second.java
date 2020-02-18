class Second
{
public static void main(String[] args)
{
String s3;
String s1="hell world and Hehellllo to hell and world to hell ";
int i=0;
String[] s2=s1.split(" ");
s3=s1.replaceAll("hell ","");
String[] s4=s3.split(" ");
int count=s2.length-s4.length;
System.out.println("The number of hell count is:- " + count+" in "+s1);

}
}

