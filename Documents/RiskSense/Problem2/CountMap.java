
import java.util.*;
import java.lang.*;
import java.io.*;


/*

Class CountMap contains function to generate map of counts for given array of elements.

*/
class CountMap
{   
    
    // Function generateCountMap generates a map of counts for unique strings in the array.
    // <param> elements is an array of strings.
    // Returns a hashmap of counts of unique values in the array.
    public static HashMap<String,Integer> generateCountMap(String[] elements)
    {
        // Declare the HashMap store the count of unique elements.
        HashMap<String,Integer> uniqueElementCounts = new HashMap();
        
        // For every string in the array.
        for (String element : elements)
        {
            // Increment the count of the string in map by 1.
            uniqueElementCounts.put(element,uniqueElementCounts.getOrDefault(element, 0)+1);
        }
        
        // return the map.
        return uniqueElementCounts;
    }


    
	public static void main (String[] args) 
	{
	     // Test cases.
	     System.out.println(CountMap.generateCountMap(new String[]{"Red","Blue","Green","Blue"}));
	     System.out.println(CountMap.generateCountMap(new String[]{"Toyota","Honda","Mazda","Toyota","Benz"}));
	     System.out.println(CountMap.generateCountMap(new String[]{"Football","Soccer"}));
	     System.out.println(CountMap.generateCountMap(new String[]{}));	    
	}
	
	/* Outputs
	
	{Red=1, Blue=2, Green=1}
	{Benz=1, Toyota=2, Mazda=1, Honda=1}
        {Soccer=1, Football=1}
	{}
	
	*/
	
	
}
