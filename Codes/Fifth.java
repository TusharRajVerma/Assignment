import java.util.Arrays;
class Fifth
{
public static void main(String[] args)
{
int i=0,j=0;
int[] a1={2,3,4,1,7,3};
int[] a2={1,2,9,3,11,6};
Arrays.sort(a1);
Arrays.sort(a2);
while(i<a1.length && j<a2.length)
{
if(a1[i]==a2[j])
{
System.out.print(a1[i]+" ");
i=i+1;
j=j+1;
}
else if(a1[i]>a2[j])
{
j=j+1;
}
else
{
i=i+1;
}
}
}
} 
