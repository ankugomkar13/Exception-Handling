package org.example.ExceptionPractices;

public class NullException {
    public static void main(String args[])
    {
        String str = null;
        try{
            System.out.println(str.toUpperCase());
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println("There is not exception");
        }
    }
}
