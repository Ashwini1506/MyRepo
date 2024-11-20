package Javaprograms;

public class UpperLowerCase {
    String s = "Ashwini";
    public UpperLowerCase() {
        System.out.println("upper to lowercase");
    }

    public void mymethod()
    {
char firstc=Character.toLowerCase(s.charAt(0));
String substring=s.substring(2).toUpperCase();
String f=firstc+substring;
        System.out.println(f);


    }
    public void convertmethod() {

        if (s != null && !s.isEmpty()) {
            char Firstchar = Character.toLowerCase(s.charAt(0));
            String RemainingString = s.substring(1).toUpperCase();
            String FinalString = Firstchar + RemainingString;
            System.out.println(FinalString);

        }


    }

    public static void main(String [] args)
    {
UpperLowerCase up=new UpperLowerCase();
up.convertmethod();
up.mymethod();
    }


}
