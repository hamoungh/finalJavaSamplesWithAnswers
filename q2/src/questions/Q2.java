package questions;


public class Q2 {

     public void generateRandomCoordinates(
    		 int[] x,int[] y){ 
         int n=50; 
         for (int i = 0; i < n; i++)
         {
             x[i] = (int)(Math.random()*30+10); 
             y[i] =  (int)(Math.random()*30+10);
         }
     
     }
}
