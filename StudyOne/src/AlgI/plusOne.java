package AlgI;

public class plusOne {

	/*
	 You are given a large integer represented as an integer array digits, 
	where each digits[i] is the ith digit of the integer. 
	The digits are ordered from most significant to least significant(big->samll) in left-to-right order. 
	The large integer does not contain any leading 0's.

	Increment the large integer by one and return the resulting array of digits.
	*/
	
	public static void main(String[] args) {
	//no-zero at leading
	  int[] oldNum = {1,2,3}; 
		  //{9,9}; 
	  int [] newNum = {}; 
	
      System.out.print("The input array's integer is "); 
      print(oldNum);
      System.out.println("");
      //Need to check why the order of the function placement matters to oldNum
      newNum= plusOneFun(oldNum);
      System.out.print("The increamint by one integer is ");
      print(newNum); 
      
	}

	
	public static int[] plusOneFun (int[] digits) {
		
		int[] result ;
		int dLen = digits.length;
		//backwards from the least to greatest
		//All 9s?
		for(int i=dLen-1 ;i>=0; i--) {
			if(digits[i]<9) {
				//0-8 ,since 9 will add one to the next number
				digits[i]++;
				
				result =digits;
				return result;
				
				//digits[i] =digits+1;
				//prefix version(++i)-> give you incremented value
				//postfix version(i++)-> give you the original value
				 
				//return digits;
			}
			//if it is 9, then the digit will be 0
			digits[i]=0;
		}
		
		//if there are all 9s, then nice the array will be 0s,
		//so the array will just be zeroes,and first one will be 1
		
		result = new int[dLen+1];//new length
		
		result[0] =1;
		
		return result;
		
	}
	
	
	
	public static void print(int[] arry) {
		for(int i : arry) {
			System.out.print(i);
		}
	}
	

}
