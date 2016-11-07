package anagrams;

import java.util.Scanner;
import java.util.Arrays;

public class Anagram{
	public static void main(String args[]) 
	{
		System.out.println("Enter first Word:");
	//taking the input
		Scanner input=new Scanner(System.in);
	String s1=input.nextLine();
	System.out.println("Enter second word:");
	String s2=input.nextLine();
	AnagramFinder af= new AnagramFinderImpl();
      System.out.println(af.areAnagrams(s1, s2));

	}
}
