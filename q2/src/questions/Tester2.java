package questions;
/*
 / Insight class Q2 write a public function called 'generateRandomCoordinates'
 * To generate 50 random coordinates
 * in a two-dimensional coordinate system 
 * within The box (10,10) and (40,40) 
 * using a for loop. 
 * it should put this random points into
 * the given array of integers x,y which are passed 
 * as an argument 
 * (please look at the following tester)
*/

public class Tester2 {

	public static void main(String[] args) {
        int[] x = new int[50];
        int[] y = new int[50];
        new Q2().generateRandomCoordinates(x, y);
        for(int i=0;i<50;i++)
        	System.out.println(x[i]+" "+y[i]);
	}

}
