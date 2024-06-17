package org.example.ExceptionPractices;

public class NestedCatchEx {
    public static void main(String args[])
    {
        try{
            int a = 10/0;
            System.out.println(a);
        }
        catch (Exception e)
        {
            System.out.println(e);
            try{
                String str = null;
                System.out.println(str.toUpperCase());
            }
            catch (Exception a)
            {
                System.out.println(a);
            }

        }
    }
}
