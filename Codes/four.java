class Four
{
public static void main(String[] args)
{
String str="tushar@1234RAJVERMA";
int i,cu=0,cl=0,cn=0,cs=0;
for(i=0;i<str.length();i++)
{
if(Character.isUpperCase(str.charAt(i)))
{
cu=cu+1;
}
else if(Character.isLowerCase(str.charAt(i)))
{
cl=cl+1;
}
else if(Character.isDigit(str.charAt(i)))
{
cn=cn+1;
}
else
{
cs=cs+1;
}
}
System.out.println(str);
System.out.println(cu);
System.out.println(cl);
System.out.println(cn);
System.out.println(cs);
}
}
