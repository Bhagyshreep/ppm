package com.ex;

/**
 * Hello world!
 *
 */
public class App 
{
    public int sum(int x,int y){
        return x+y;
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App app=new App();
        int result=app.sum(5,10);
        System.out.print("the result"+result);
    }
}
