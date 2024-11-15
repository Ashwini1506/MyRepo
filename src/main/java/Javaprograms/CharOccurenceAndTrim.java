package Javaprograms;


public class CharOccurenceAndTrim {
// Iggu LOOVE INDIA

    //IU LVE NDA
    public static void main(String[] args) {
        String s="I Love In   d  ia ";
        String s2="";
        String s3="";
        char[] char1=s.toCharArray();

        System.out.println(char1);
        for(int i=0;i<s.length();i++)
        {

            s3=s3+char1[i];
            //System.out.println(s3);
            if(!(s2.contains(s3)))
            {
                s2=s2+s3;
                //System.out.println(s2);
            }
            s3="";
        }
        System.out.println(s2);

    }

}

