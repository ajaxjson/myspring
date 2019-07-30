package com.controller;


import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;

import org.json.simple.JSONObject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.utilities.courselist;
@Controller
public class studentController {
	@RequestMapping("/registfrm")
	public ModelAndView registerfrm()
	{
		
		//HashMap<String, String> courselist_for_select = courselist.course();
		//ModelAndView mav = new ModelAndView("student_registerfrm");  
		   // must match the jsp page name which is being requested.
//		String optionPreparing = "<select name='list_c'>";
//		 for (HashMap.Entry<String, String> entry : courselist_for_select.entrySet())
//			    {
//			 		optionPreparing+= "<option value='"+entry.getKey() + "'>" + entry.getValue() + entry.getValue()
//			 				+"</option>";
//			    }
//		 optionPreparing+= "</select>";
//		mav.addObject("c_list", optionPreparing); 
//		
//		    return mav; 
		return new ModelAndView("student_registerfrm");
		//, "course_list", courselist_for_select

	}
	@RequestMapping("/regist")
	public  ModelAndView register(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		//int[] intArrayB = new int[] {4,5,6,7,8};
		//int[] intArrayB = {1,2,3};
		
		String id = request.getParameter("id");
//		
		String surname = request.getParameter("surname");
		String course_select = request.getParameter("course_select");
		String name = request.getParameter("name");
		
		//System.out.print(name);
		 JSONObject jsonxobj = new JSONObject();

		  jsonxobj.put("id",id);	
	      jsonxobj.put("name",name);
	      jsonxobj.put("surname",surname);
	      jsonxobj.put("course_select",course_select);
	     

	      StringWriter out = new StringWriter();
	      jsonxobj.writeJSONString(out);
	      
	      String jsonText = out.toString();
	      //System.out.print(jsonText);
	      
		String[] thisIsAStringArray = { id,name,surname,course_select };
		
		return new ModelAndView("display_regist", "response",jsonText);
//		ModelAndView mav = new ModelAndView(); 
//		mav.setViewName("display_regist.jsp");
//		mav.addObject("name", name);
//		return mav;

	}
	
	@RequestMapping("/testwelcome")
	public ModelAndView printWelcome() {
 
		String heading = "Spring MVC: How to Access ModelMap Values in a JSP?";
		String result1 = "Hey.. I'm result1.. You are seeing me on welcome page.";
		String result2 = "Hey.. I'm result2.. ";
 
		String credit = "Demo by <a href='https://crunchify.com'>Crunchify</a>. Click <a href='https://crunchify.com/category/java-tutorials/'>here</a> for more than 350 Java Examples.";
 
		// you can add any Collection Objects to ModelMap
		// including JSON, String, Array, Map, List, etc...
		ModelAndView mav = new ModelAndView("welcome");  
		HashMap<String, String> courselist_for_select = courselist.course();
		String optionPreparing = "<select name='list_c'>";
		 for (HashMap.Entry<String, String> entry : courselist_for_select.entrySet())
			    {
			 		optionPreparing+= "<option value='"+entry.getKey() + "'>" + entry.getValue() + entry.getValue()
			 				+"</option>";
			    }
		 optionPreparing+= "</select>";
		
		
		    
		
		    mav.addObject("heading", heading);
		    mav.addObject("result1", result1);
		    mav.addObject("result2", result2);
		    mav.addObject("credit", credit);
		    
		    mav.addObject("c_list", optionPreparing); 
		   
		    return mav; 
	}
	
}
