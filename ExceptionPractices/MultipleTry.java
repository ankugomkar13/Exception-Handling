package org.example.ExceptionPractices;

public class MultipleTry {
    public static void main(String args[])
    {
        try{
            int a=10,b=0,c;
            c=a/b;
            System.out.println(c);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        try{
            int a[] ={10,20,30,304};
            System.out.println(a[5]);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
