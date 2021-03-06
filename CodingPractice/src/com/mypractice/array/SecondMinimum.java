package com.mypractice.array;

public class SecondMinimum {

	
	public static int getSecondMinimum(int[] array){
		int firstMin = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
		int length = array.length;
		if(length==0)
			return 0;
		else if(length < 2)
			return array[0];
		else{
			for(int i=0; i<length; i++){
				/*if current element is smaller than first minimum,
				     assign it to first min and replace second min with first min*/ 
				if(array[i] < firstMin){
					secondMin = firstMin;
					firstMin = array[i];
				}
				/* if current element is in between firstMin and secondMin*/
				if(array[i] < secondMin && array[i]!= firstMin){
					secondMin = array[i];
				}
			}
			if(secondMin == Integer.MAX_VALUE)
				return 0;
			
			return secondMin;
		}		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {0,1};
		System.out.println("Second Minimum = "+SecondMinimum.getSecondMinimum(array));
	}

}
