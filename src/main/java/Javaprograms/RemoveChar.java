package Javaprograms;

public class RemoveChar
{

    public static void main(String[] args)
    {
        String s="hjg hg hjg jhg";
        char chartoremove=' ';

        StringBuilder b=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ' && s.charAt(i)!='h')
            {
                b.append(s.charAt(i));
            }
        }
        System.out.println(b);
    }
}
