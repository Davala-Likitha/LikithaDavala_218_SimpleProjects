package com40;

public class DiamondProblem implements First, Second {
	public void show() 
    {  
       com40. First.super.show(); 
       com40. Second.super.show(); 
    } 

	public static void main(String[] args) {
		DiamondProblem ob = new DiamondProblem(); 
        ob.show(); 


	}

}
interface First 
{  
    default void show() 
    { 
        System.out.println("Default First"); 
    } 
} 
interface Second 
{  
    default void show() 
    { 
        System.out.println("Default Second"); 
    } 
}  