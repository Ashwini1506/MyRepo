package oops;

public class ParameterizedConstructor
{
    ParameterizedConstructor()
    {
        this(10,20);
    }
    ParameterizedConstructor(int a, int b)
    {
        System.out.println(a+b);

    }

}
