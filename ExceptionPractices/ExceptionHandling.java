package org.example.ExceptionPractices;

public class ExceptionHandling {
    public static void main(String args[])
    {
        try
        {
            System.out.println("My name is Ankita");
            int a=10,b=0,c;
            c=a/b;
            System.out.println(c);
            System.out.println("Null");

        }
        catch(Exception e)
        {
            System.out.println("/ by 0");
        }
        finally{
            System.out.println("I am always execute");
        }
        System.out.println("My name is Ankita Gomkar");
    }
}
