package org.example.ExceptionPractices;

public class ArithmaticException extends Throwable {

    public static void main(String args[])
    {
        System.out.println("Main Method start");
        int a=10,b=0,c;
        try{
            c=a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Main method ended");

    }
}
