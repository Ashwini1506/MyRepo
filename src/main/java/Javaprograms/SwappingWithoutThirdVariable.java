package Javaprograms;

public class SwappingWithoutThirdVariable
{
    public static void main(String[] args)
    {
        int num1=30;
        int num2=20;

//        num2=num2+10; //30
//        num1=num2-10; //20

        num1=num1+num2;//50
        num2=num1-num2;//50-20=30
        num1=num1-num2;//50-30

        System.out.println("Number1= "+ num1);
        System.out.println("Number2=" +num2);

    }
}
