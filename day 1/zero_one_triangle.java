class zero_one_triangle{
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                if((i+j)%2==0)
                System.out.print("1");
                else
                 System.out.print("0");
            } System.out.println();
        }
    }
}

output

1
01
101
0101
10101
