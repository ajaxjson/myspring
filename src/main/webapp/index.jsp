<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HelloWorld</title>
<script src="https://code.jquery.com/jquery-1.10.2.js"	type="text/javascript"></script> 

 <script type="text/javascript">
 function windowalert()
 {
	 alert($("#a1").html())";
 }
 </script>
</head>
<body>
<a  id="a1">Hello Page</a>
<a  id="a2" onclick="windowalert();">Student Page</a>
<button  onclick="windowalert();">sss</button>
</body>
</html>
