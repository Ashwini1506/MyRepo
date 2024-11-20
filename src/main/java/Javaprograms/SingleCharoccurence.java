package Javaprograms;

import java.util.Scanner;

public class SingleCharoccurence
{
    public static void main (String[] args)
    {
        String s1;
        System.out.println("Please enter the string for which char occurence is to be checked");
        Scanner s2=new Scanner(System.in);
        s1=s2.nextLine();
        int count=0;

        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(ch=='a'|| ch=='A')
            {
                count++;
            }
        }
        System.out.println("Char occurence a="+count);
    }
}
