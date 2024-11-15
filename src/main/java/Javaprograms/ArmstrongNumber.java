package Javaprograms;

import java.util.Scanner;

public class ArmstrongNumber
{
    //number with its length if we multiply then the answer will be equal to number
    //0,1,153,1634 is armstrong number
    public void armsgtrong()
    {
        int length=0, no, t1;

        System.out.println("Please enter number");
        Scanner s=new Scanner(System.in);
        no=s.nextInt();

        t1=no;

        while(t1!=0)
        {
            length=length+1;
            t1=t1/10;
        }
        System.out.println("length="+length);

int t2=no, rem, mul=1, arm=0;
while(t2!=0)
    {
    rem=t2%10;
    for(int i=1;i<=length;i++)
    {
        mul=mul*rem;
    }
arm=arm+mul;
    t2=t2/10;
    }
        if(arm == no)
        {
            System.out.println(no+" Number is armstrong number");
        }
        else
        {
            System.out.println(no+" Number is not armstrong number");
        }

    }
    public static void main(String[] args)
    {
        ArmstrongNumber armstrongNumber=new ArmstrongNumber();
        armstrongNumber.armsgtrong();
    }


}
