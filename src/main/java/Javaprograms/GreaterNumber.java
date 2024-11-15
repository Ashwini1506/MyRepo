package Javaprograms;

public class GreaterNumber
{
    int x = 30;
    int y = 50;
    int z = 90;
    public void bb()
    {
        if(x>y)
        {
            if(x>z)
            {
                System.out.println("X is Greater"+x);
            }
            else
            {
              System.out.println("Z is greater"+z);
            }
        }
        else if(y>z)
        {
            System.out.println("Y is greater"+y);
        }
        else
        {
            System.out.println("Z is greater"+z);
        }
    }
    public static void main (String[] args)
    {

GreaterNumber gc=new GreaterNumber();
gc.bb();
        System.out.println("Program ended");
    }

}

