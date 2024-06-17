package org.example.ExceptionPractices;

class InvalidAgeException extends Exception
{
    InvalidAgeException(String msg)
    {
        System.out.println(msg);
    }
}
public class UserdefineEx {
    public static void voting(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("your are not eligible for voting");
        }
        else{
            System.out.println("eligible for voting");
        }
    }
    public static void main(String args[])
    {
        try{
            voting(21);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
