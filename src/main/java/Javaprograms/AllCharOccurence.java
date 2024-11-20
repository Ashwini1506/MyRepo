package Javaprograms;

import java.util.HashMap;

public class AllCharOccurence
{
    public static void main(String[] args)
    {
        String a="7867";

        HashMap<Character,Integer> hashMap= new HashMap<>();
        for(int i=0;i<a.length();i++)
        {
            if(hashMap.containsKey(a.charAt(i)))
            {
                int n=(hashMap.get(a.charAt(i))+1);
                hashMap.put(a.charAt(i),n);
            }
            else
            {
                hashMap.put(a.charAt(i),1);
            }
        }
        System.out.println(hashMap);


    }

}
