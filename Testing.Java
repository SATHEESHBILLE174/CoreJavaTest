public class Testing {
	public  long maxSubArraySum(int a[],int size)
	{
	     
	    int maxSoFar = a[0], maxEndingHere = 0;
	 
	    for (int i = 0; i < size; i++)
	    {
	    	maxEndingHere = maxEndingHere + a[i];
	        if (maxEndingHere < 0)
	        	maxEndingHere = 0;
	         
	        
	        else if (maxSoFar < maxEndingHere)
	        	maxSoFar = maxEndingHere;
	         
	    }
	    return maxSoFar;
	}