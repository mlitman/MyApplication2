package com.example.awesomefat.myapplication;

public class Test2
{
    public static int answer;

    public static int getIntFromChar(char c)
    {
        //'4' -> 4
        return "0123456789".indexOf(c);
    }

    public static int getIntFromString(String s)
    {
        //"123"
        int sum = 0;
        int place = 1;
        for(int i = s.length()-1; i >= 0; i--)
        {
            sum = sum + (Test2.getIntFromChar(s.charAt(i)) * place);
            place = place * 10;
        }
        return sum;
    }
}
