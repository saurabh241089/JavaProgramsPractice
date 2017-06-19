package com.shapecalculator.impl;

import com.shapecalculator.ShapeCalculator;

public class TriangleCalculator extends ShapeCalculator {

	public String calculateShape(Integer height, String label, Integer labelRow) throws Exception {
		System.out.println("Entering calculateShape method");
		try{
			return getUpperTraingle(height, label, labelRow);
		}catch(Exception e){
			System.out.println("Exception occurred : " + e.getMessage());
			throw e;
		}
	}
	
	public String getUpperTraingle(Integer height, String label, Integer labelRow){
		String triangle = "";
	    int labelLength = label.length();
	    int lableRowFinal = labelRow != null? labelRow : (height/2);
	    int diff = lableRowFinal - labelLength;
	
	    for(int i=1;i<=height;i++){
	            
	        //space printing logic
	        int j=0, k=0;
	        while(j<(height-i)){
	            triangle+="&nbsp;";
	            j++;
	        }
	        //ascii character printing logic
	        if(i == lableRowFinal && labelLength > 0){                    
	            if(diff > 0){
	                //label & ascii character printing
	                 int firstHalf = diff/2;
	                 int secondHalf = diff - firstHalf;
	                 int l=0,m=0;
	                 while(l<firstHalf)
	                 {
	                     triangle+="X&nbsp;";                               
	                     l++;
	                 }
	                 while(k<labelLength){                
	                    triangle+=label.charAt(k)+"&nbsp;";                               
	                    k++;
	                } 
	                while(m<secondHalf)
	                {
	                    triangle+="X&nbsp;";                               
	                    m++;
	                } 
	            }else{
	                //only label will be printed on line
	                while(k<labelLength){                
	                    triangle+=label.charAt(k)+"&nbsp;";                               
	                    k++;
	                }
	            }
	        }else{
	            //ascii character printing
	            while(k<i){                
	                triangle+="X&nbsp;";                               
	                k++;
	            }
	        }    
	        
	        triangle+="<br />";
	    }
	    return triangle;
	}
	
public String getLowerTraingle(Integer height, String label, Integer labelRow){
	
		String triangle = "";
        int labelLength = label.length();
        int lableRowFinal = labelRow != null? labelRow : (height/2);
        int diff = height - (lableRowFinal-1) - labelLength;
        for(int i=1;i<=height;i++){
                
            //space printing logic
            int j=0, k=0;
            while(j<i){
                triangle+="&nbsp;";
                j++;
            }
            //ascii character printing logic
            if(i == lableRowFinal && labelLength > 0){                    
                if(diff > 0){
                    //label & ascii character printing
                     int firstHalf = diff - (diff/2);
                     int secondHalf = diff - firstHalf;
                     int l=0,m=0;
                     while(l<firstHalf)
                     {
                         triangle+="X&nbsp;";                               
                         l++;
                     }
                     while(k<labelLength){                
                        triangle+=label.charAt(k)+"&nbsp;";                               
                        k++;
                    } 
                    while(m<secondHalf)
                    {
                        triangle+="X&nbsp;";                               
                        m++;
                    } 
                }else{
                    //only label will be printed on line
                    while(k<labelLength){                
                        triangle+=label.charAt(k)+"&nbsp;";                               
                        k++;
                    }
                }
            }else{
                //ascii character printing
                while(k<(height-i+1)){                
                    triangle+="X&nbsp;";                               
                    k++;
                }
            }    
            
            triangle+="<br />";
        }
        return triangle;
    }
	
}
