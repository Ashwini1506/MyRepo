package Javaprograms;

public class PrimeNoProgram {
    public static void main(String[] args) {
        int i;
        int n=20;
        int temp=0;
        for (int j = 0; j <=n ; j++)
        {
            for ( i = 2; i <= n-1; i++)
            {
                if(n%i==0)
                {
                   temp =temp +1;
                }
            }
        }
        if(temp==0)
        {
            System.out.println("no.prime "+ n);
        }
        else {
            System.out.println("no.is not prime ");
        }
    }
}
