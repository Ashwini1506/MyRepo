package Javaprograms;

public class Primen
{
    public static void main(String [] args)
    {
        int n=20;
        int count, temp=0;

        for(int i=2;i<=n-1;i++)
        {
            if(n%i==0)
            {
                 temp=temp+1;

            }
        }
        System.out.println("");


    }
}
