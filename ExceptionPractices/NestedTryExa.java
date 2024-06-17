package org.example.ExceptionPractices;

public class NestedTryExa {
    public static void main(String args[])
    {
        try{
            int a=10,b=5;
            int c =a/b;
            try{
                String str= null;
                System.out.println(str.toUpperCase());
            }
            catch (Exception e)
            {
                System.out.println(e);
                System.out.println("It Inner loop");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println("It outer loop");
        }
    }
}
