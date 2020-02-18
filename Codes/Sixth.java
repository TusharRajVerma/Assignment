class Sixth
{
public static void main(String[] args)
{
int i;
int res=0;
int[] arr={1,2,1,2,5,3,3,4,4};
for(i=0;i<arr.length;i++)
{
res=res^arr[i];
}
System.out.println(res);
}
}
