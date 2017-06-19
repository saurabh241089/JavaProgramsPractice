package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.shapecalculator.AbstractShapeFactory;
import com.shapecalculator.ShapeCalculator;

@Controller
public class ShapeController {
	
	@RequestMapping("/shapecalculator")
	public ModelAndView displayWelcomePage(){
		return new ModelAndView("welcome", "message", "Hello User..!!");
	}
	
	@RequestMapping("/displayShape")
	public ModelAndView displayShape(@RequestParam Map<String,String> allRequestParams, ModelMap model) {
		System.out.println("Entering displayShape method");
		//As of now we are not accepting input from jsp so hardcoding here
		Integer height = Integer.parseInt(allRequestParams.get("height"));
		String label = allRequestParams.get("label").isEmpty() ? "HI": allRequestParams.get("label");
		Integer labelRow = allRequestParams.get("row").isEmpty() ? null : Integer.parseInt(allRequestParams.get("row"));
		String shapeName = allRequestParams.get("shapeType");
		
		String calculatedShape = null;
		ShapeCalculator shapeCalculator = null;
		try{
			validateInput(height,label,labelRow);
			if(null != shapeName){
				//Abstract factory design pattern
				shapeCalculator = AbstractShapeFactory.getShapeCalculator(shapeName);
				
    			calculatedShape = shapeCalculator.calculateShape(height, label, labelRow);

			}
		}catch(Exception e){
			System.out.println("Exception occurred : " + e.getMessage());
			//Do error handling either on same page or divert it to some error.jsp
			return new ModelAndView("errorpage", "message", e.getMessage());
		}
		System.out.println("Exiting displayShape method");
		return new ModelAndView("welcome", "message", calculatedShape);
	}
	
	private void validateInput(Integer height, String label, Integer labelRow) throws Exception{
		System.out.println("Entering validateInput method");
		//Add logic to validate inputs
		//throw new Exception("validation error message add here");
		System.out.println("Exiting validateInput method");
	}
}
