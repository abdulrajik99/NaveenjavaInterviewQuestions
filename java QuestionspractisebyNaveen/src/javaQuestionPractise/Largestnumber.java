package javaQuestionPractise;

import java.util.Scanner;

public class Largestnumber {

	public static void main(String[] args) {
		int b=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 st number");
		int a=sc.nextInt();
		System.out.println("enter 2nd number");
		
		b=sc.nextInt();
		
		System.out.println("enter 3rd number");
		int c=sc.nextInt();
//        if(a>b && a>c){
//        	System.out.println("a = "+a+" is greater ");
//        }
//        else if(b>c){
//        	System.out.println("b = "+b+" is greater");
//        }
//        else {
//        	System.out.println("c =  "+c+" is greatest number");
//        }
//	
        if(a>=b){
        	if(a>=c){
        		System.out.println("a = "+a+" is greater");
        	}
        	else
        	{
        		System.out.println("c = "+c+" is greater ");
        	}
        }
        else{
        	if(b>=c)
        	{
        		System.out.println("b = "+b+" is greater ");
        	}
        	else
        	{
        		System.out.println("c =  "+c+" is greatest number");	
        	}
        }
	
	
	
	
	
	}

}
