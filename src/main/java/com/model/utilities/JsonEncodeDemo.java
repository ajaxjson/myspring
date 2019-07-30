package com.model.utilities;
import java.io.IOException;
import java.io.StringWriter;

import org.json.simple.JSONObject;
//import org.json.simple.JSONObject;
//import org.json.simple.JSONArray;
//import org.json.simple.parser.ParseException;
//import org.json.simple.parser.JSONParser;



class JsonEncodeDemo {
//
   public static void main(String[] args) throws IOException {
	
      JSONObject jsonxobj = new JSONObject();

      jsonxobj.put("name","foo");
      jsonxobj.put("num",new Integer(100));
      jsonxobj.put("balance",new Double(1000.21));
      jsonxobj.put("is_vip",new Boolean(true));

      StringWriter out = new StringWriter();
      jsonxobj.writeJSONString(out);
      
      String jsonText = out.toString();
      System.out.print(jsonText);
   }
}