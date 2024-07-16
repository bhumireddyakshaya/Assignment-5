class Pattern1
{
public static void main(String arg[])
{
int  n,j,i,s;
n=4;
for(i=1;i<=n;i++)
{
for(s=n-i;s>0;s--)
{
System.out.println(" ");
}
for(j=1;j<=i;j++)
{
System.out.print(i+" ");
}
System.out.println();
}
for(i=n-1;i>=1;i--){
for(s=n-i;s>0;s--){
System.out.println(" ");
}
for(j=1;j<=i;j++)
{
System.out.print(i+" ");
}
System.out.println();
}
}
}
}