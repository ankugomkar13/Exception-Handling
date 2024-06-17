package org.example.ExceptionPractices;

public class NestedFinallyBlock {
    public static void main(String args[])
    {
        try{
            int a = 5/1;
            System.out.println(a);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("I am Always Runing");
            try{
                String str = null;
                System.out.println(str.toUpperCase());
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            finally {
                System.out.println("I am good");
            }
        }
    }
}
