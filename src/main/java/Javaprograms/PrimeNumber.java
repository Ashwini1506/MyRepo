package Javaprograms;

public class PrimeNumber
{

    //7  ---- 2   to    2,3
        public static void main(String [] args)
        {
           int count=0;
            int n=20;
            System.out.println("Prime numbers between 1 to "+n+" are ");
            for(int i=0;i<=n;i++)//2
            {
                for(int j=1;j<=i;j++)//2
                {
                    if(i%j==0)
                    {
                        count++;
                    }
                }
                if(count==2) {
                    System.out.println(i);
                }
                count=0;
            }
        }
    }


