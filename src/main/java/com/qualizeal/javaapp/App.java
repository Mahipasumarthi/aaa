package com.qualizeal.javaapp;

import  com.qualizeal.javaapp.mathematics.Programmer16Addition;
import  com.qualizeal.javaapp.mathematics.Programmer16Subtraction;
import  com.qualizeal.javaapp.mathematics.Programmer16Multiplication;
import  com.qualizeal.javaapp.mathematics.Programmer16Division;





public class App {
    public static void main(String[] args ){
  
      Programmer16Addition programmer16Addition = new Programmer16Addition();
	  
      int sum = programmer16Addition.add();
	  System.out.println(sum);
	  
	  
	  Programmer16Subtraction programmer16Subtraction = new Programmer16Subtraction();
	  
      int difference = programmer16Subtraction.subtract();
	  System.out.println(difference);
	  
	  
	  Programmer16Multiplication programmer16Multiplication = new Programmer16Multiplication();
	  
      int product = programmer16Multiplication.multiply();
	  System.out.println(product);
	  
	  Programmer16Division programmer16Division = new Programmer16Division();
	  
      int divide = programmer16Division.divide();
	  System.out.println(divide );
	  
	  
	  
	  
	  

	  
	  
    }
}