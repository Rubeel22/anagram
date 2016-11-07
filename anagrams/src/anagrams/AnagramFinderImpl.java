package anagrams;

import java.util.Arrays;

public class AnagramFinderImpl implements AnagramFinder{
	public boolean areAnagrams(String s1, String s2){ 
		String s1NoSpace = s1.replaceAll("\\s","");
		String s2NoSpace = s2.replaceAll("\\s","");
		
		//sort s1 and s2
		char [] c1 = s1NoSpace.toCharArray();
		Arrays.sort(c1);
		String newS1 = new String(c1);
		char [] c2 = s2NoSpace.toCharArray();
		Arrays.sort(c2);
		String newS2 = new String(c2);
		if( newS1.compareToIgnoreCase(newS2)==0)
				return true; 
		else
		return false;
		
			
		
				
	}
}
