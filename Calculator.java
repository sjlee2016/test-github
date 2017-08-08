package com.mycompany.test;

public class Calculator{

  public static void main(String[] args)
  {
    int a=4;
    int b=2;

   System.out.println(" a + b is  " + sum(a,b));
   System.out.println(" a - b is  " + sub(a,b));
  }

  private static int sum(int a, int b)
  {
    return a+b;
  }

  private static int sub(int a, int b)
  {
   //returns the result of a-b

   return a-b;
  }
  private static int mult(int a, int b)
  {
   //returns the result of a-b

   return a*b;
  }
}
