package sample;

import java.util.Scanner;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter your city name");
      String name=sc.nextLine();
      if(name.equals("hyderabad"))
      {
      System.out.println("hello hyderabad,aadaab");
      }
      else if (name.equals("chennai")) 
      {
    	  System.out.println("hello madrasi,vanakkam");
      }
      else if (name.equals("bengulure"))
      {
    	  System.out.println("hello kannadika,namaskar");
      }
      else
      {
    	  System.out.println("please enter a valid city name");
      }
	}

}
