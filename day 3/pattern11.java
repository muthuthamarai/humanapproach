public class pattern11 
{
    public static void main(String[] args)
    {
        int n=5;
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        for(int k=2;k<=n;k++)
        {
            for(int l=1;l<=k;l++)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
