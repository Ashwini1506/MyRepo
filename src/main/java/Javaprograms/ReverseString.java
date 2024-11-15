package Javaprograms;

import java.io.InputStream;
import java.util.Scanner;

public class ReverseString
{

public void revString()
{
    String str="Ashwini";
    int length=str.length();
int j;
    String reverse="";
    for(j<length-1;j>=0;j--)
    {
reverse=reverse+str.charAt(j);
    }

}
        public static void main (String [] args)
        {
            String s="Ashwini";
            String rev="";
            for(int i=0; i<s.length();i++)
            {
                rev=s.charAt(i)+rev;
            }
            System.out.println("Reverse string is:"+rev);

            if(s==rev)
            {
                System.out.println(s+" is Palindrome");
            }
            else
            {
                System.out.println(s+" is not a Palindrome");
            }
        }
    }


