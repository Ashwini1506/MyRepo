package Javaprograms;

public class CountNumberOfChar
{
    public static void main(String[] args)
    {
        int count=0;
        String str="fdgf hgy hjgj jhjg";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='f')
            {
                count++;
            }
        }
        System.out.println(count);

    }
}
