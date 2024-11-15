package Javaprograms;

public class Largestnumber
{
    public static void main (String[] args) {
        int x = 20;
        int y = 10;
        int z = 0;

        if (x>y)
        {
            if(x>z)
            {
                System.out.println("Largest number is x="+ x);
            }
        }

        else if(y>z)
        {
            System.out.println("Largest number is y="+y);
        }

        else
        {
            System.out.println("Largest number is z="+z);
        }
    }
}
