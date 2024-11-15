package exceptionHandling;

public class ExceptionHandling
{

    public static void trycatch() throws Exception
    {
            System.out.print("Hello world");
            throw new ArithmeticException("");
            //it will not allow to write anything after we throw excpetion delibrately so whatever we will write after throw exception that is to be removed
           // int i = 1 / 0;
           // System.out.println("Completed");
    }
    public static void main (String[] args)  {
        try
        {
            trycatch();
        }
        catch(Exception exp)
        {
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();
        }
        finally
        {
            System.out.println("I m finally block");

        }



    }

// try {
//    System.out.print("Hello world");
//    int i = 1 / 0;
//    System.out.println("Completed");
//}
//        catch(Exception exp)
//    {
//        System.out.println(exp.getMessage());
//        System.out.println(exp.getCause());
//        exp.printStackTrace();
//
//    }
//        finally
//    {
//        System.out.println("I m finally method");
//    }


}
