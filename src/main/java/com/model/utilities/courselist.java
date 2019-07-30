package com.model.utilities;
import java.util.HashMap;
public class courselist {
	 public  static final HashMap<String,String> course() {
		HashMap<String, String> courselist = new HashMap<>();
	    courselist.put("de", "German");
	    courselist.put("th", "Thailand");
	    courselist.put("us", "United State");
	    courselist.put("tr", "Turkey");
	    return courselist;
//	    
//        
//	    System.out.println("Map size = " + courselist.size());
//	
//	    System.out.println("de = " + courselist.get("de"));
//	    System.out.println("th = " + courselist.get("th"));
//	    System.out.println("th = " + courselist.get("uk"));
//	
//	    System.out.println("Iterate over each Entry in HashMap");
//	    for (HashMap.Entry<String, String> entry : courselist.entrySet())
//	    {
//	        System.out.println(entry.getKey() + " = " + entry.getValue());
//	    }
//	
//	    courselist.remove("tr");
//	    if(courselist.containsKey("tr")) {
//	        System.out.println("Turkey exist in the map");
//	    } else {
//	        System.out.println("Turkey does not exist in the map");
//	    }
//	
//	    courselist.clear();
//	    System.out.println("Map size = " + courselist.size());
}
}
