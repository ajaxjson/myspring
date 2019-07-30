package com.model.utilities;

import java.io.*;
import java.sql.*;  
class OracleCon{  
public static void main(String args[]){  
try{  
//step1 load the driver class  
Class.forName("oracle.jdbc.driver.OracleDriver");  
  
//step2 create  the connection object  
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@DESKTOP-02RCN7L:1522/XE","system","55555");  
//SYSTEM@//DESKTOP-02RCN7L:1522/XE
//step3 create the statement object  
//Statement stmt=con.createStatement();  
  
//step4 execute query  
//ResultSet rs=stmt.executeQuery("select * from testx");  
//while(rs.next())  
//System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  

/*==========GET META DATA===========*/
//PreparedStatement ps=con.prepareStatement("SELECT * FROM TESTX WHERE ROWNUM <= 1");  
//ResultSet rs1 = ps.executeQuery();  
//ResultSetMetaData rsmd=rs1.getMetaData();  
//int columncount =  rsmd.getColumnCount();
//System.out.println("Total columns: "+rsmd.getColumnCount()); 
//for(int m =1;m<=columncount;m++){
//	
//	System.out.println("Column "+  Integer.toString(m)+" Name is : "+rsmd.getColumnName(m));  
//	
//}


/*=============insert ===by pure statement=========*/
//Statement stmt2=con.createStatement(); 
//stmt2.execute("INSERT INTO TESTX (ID,CODE,ERR) VALUES(4,'10004','TEST1')");

/*=============insert ===prepare statement=========*/

//PreparedStatement stmt4=con.prepareStatement("INSERT INTO TESTX (ID,CODE,ERR) values(?,?,?)");
//PreparedStatement stmt4=con.prepareStatement("INSERT INTO TESTX values(?,?,?)");
//stmt4.setInt(1,6);//1 specifies the first parameter in the query  
//stmt4.setString(2,"10006");  
//stmt4.setString(3,"TEST3");    
//int i=stmt4.executeUpdate();  
//System.out.println(i+" records inserted");  
//step5 close the connection object  
/*=============UPDATE ===prepare statement=========*/
//PreparedStatement stmt=con.prepareStatement("UPDATE TESTX SET ERR=? WHERE id=?");  
//stmt.setString(1,"TEST1");//1 specifies the first parameter in the query i.e. name  
//stmt.setInt(2,1);  
//  
//int i=stmt.executeUpdate();  
//System.out.println(i+" records updated"); 
/*=============INSERT VAI STORE PROCEDURE=========*/
//CallableStatement stmt=con.prepareCall("{call INSERT_TESTX(?,?,?)}"); 
//stmt.setInt(1,8);  
//stmt.setString(2,"10008");  
//stmt.setString(3,"TEST5");  
//int i  = stmt.executeUpdate(); 
//  
//System.out.println(i+" records inserted"); 

/*=============PLAY WITH COMMIT / ROLL BACKE=========*/
con.setAutoCommit(false);  

CallableStatement stmt=con.prepareCall("{call INSERT_TESTX(?,?,?)}"); 
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	while(true){  
		System.out.println("enter id");  
		String s1=br.readLine();  
		int id=Integer.parseInt(s1);  
		  
		System.out.println("enter code");  
		String code=br.readLine();  
		  
		System.out.println("enter err");  
		String err=br.readLine();
		
		
		
	stmt.setInt(1,id);  
	stmt.setString(2,code);  
	stmt.setString(3,err);  
	stmt.executeUpdate();   
	
	System.out.println("commit/rollback");  
	String answer=br.readLine();  
	if(answer.equals("commit")){  
		con.commit();  
	}  
	if(answer.equals("rollback")){  
		con.rollback();  
	}  
	
	System.out.println("Want to add more records y/n");  
	String ans=br.readLine();  
	if(ans.equals("n")){  
		break;  
	}  
}
con.commit();  
System.out.println("record successfully saved");  
con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
} 