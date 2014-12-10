package questions;

import java.util.ArrayList;
import java.util.*; 

public class Q3{
	
	 ArrayList<String> a=new ArrayList<String>();
	public void addString(String s){
		a.add(s); 
	}
    public boolean itContains(String s)
    {
    	return a.contains(s); 
    }
}
