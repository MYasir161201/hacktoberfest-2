public class question7 
{

    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("enter any number");
        n=s.nextInt();

        int rev=0;

        while(n>0)
        {
            int r=n%10;
            rev=(rev*10)+r;
            n=n/10;
        }

        System.out.println("the reverse of a number is "+rev);
        s.close();
    }
}
