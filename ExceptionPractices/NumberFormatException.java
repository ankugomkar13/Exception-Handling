package org.example.ExceptionPractices;

public class NumberFormatException {
    public static void main(String args[])
    {
        String str = "Ankita"; ///Only number value is converted into Integer
        try
        {
            int a = Integer.parseInt(str);
            System.out.println(a);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        System.out.println("Exception");
    }
}
