class sum_of_digit{
    public static void main(String[] args) {
        int n=5679;
        int sum=0;
        int rem=0;
        while(n>0)
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.print(sum);
    }
}