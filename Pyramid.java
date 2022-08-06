
import java.util.ArrayList;

public class Pyramid {

	static void isPyramid(int[] nts) {
		int[] ids = nts;
		boolean isPyramidValid = true;
		
        ArrayList<Integer> values = new ArrayList<>();
        for (int id: ids) {
            values.add(id);
        }
        System.out.println("The elements of the checked sequence are: "+values);
        System.out.println("The sequence has "+ values.size()+" elements.");
        int maximum = values.get(0);
        int element = values.get(0);

        // Print the max element in the checked sequence
        int iMax = 0;
        for (int i = 1; i < values.size(); i++) {
            if (maximum < values.get(i)){
              maximum = values.get(i);
              iMax = i;
            }    
        }
              element = values.get(0); 
                          
        for (int i = 1; i <= iMax; i++) {
            if (element < values.get(i)){
              //System.out.println("The element is "+ element + " and the gradation before the peak is ascending");
              element = values.get(i);
            }
              else{
            	isPyramidValid = false;
                System.out.println("The gradation after element "+ element + " is wrong!");
		      }
        }
              
         for (int i = iMax+1; i < values.size(); i++) {
            if (element > values.get(i)){
              //System.out.println("The element is "+ element + " and the gradation after the peakk is descending");
              element = values.get(i);
            }
              else{
            	  isPyramidValid = false;
            	  System.out.println("The gradation after element "+ element + " is wrong!");
		      }
         }
                
         	System.out.println("The peak element value is "+ maximum + " and his index is = "+ iMax);
      
    
         	// Check for duplicated elements in the sequence
         for (int i = 0; i < values.size(); i++) {
          element = values.get(i);
          
          }
  
         for(int i =0; i < values.size(); i++) {
           if (values.lastIndexOf(values.get(i)) != i)  {
    	     isPyramidValid = false;
             System.out.println("The element "+values.get(i)+" is duplicated!");
           }
        }
    
         if (isPyramidValid) {
        	 System.out.println("The checked sequence is valid pyramid!");
         }
         else {
        	 System.out.println("The checked sequence is NOT valid pyramid!");
         }
	}
	
	
	public static void main(String[] args) {
		
		int[] nts = {1,3,5,7,9,100,80,70,60,50,40,30,20,10};
		isPyramid(nts);

	}

}
