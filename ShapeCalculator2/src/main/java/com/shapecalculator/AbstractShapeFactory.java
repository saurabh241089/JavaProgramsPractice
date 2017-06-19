package com.shapecalculator;

import com.shapecalculator.impl.DiamondCalculator;
import com.shapecalculator.impl.TriangleCalculator;

public class AbstractShapeFactory { 

	public static ShapeCalculator getShapeCalculator(String shapeName){
		if(shapeName.trim().equalsIgnoreCase("TRIANGLE")){
			return new TriangleCalculator();
		}else if(shapeName.trim().equalsIgnoreCase("DIAMOND")){
			return new DiamondCalculator();
		}
		return null;
	}
}
