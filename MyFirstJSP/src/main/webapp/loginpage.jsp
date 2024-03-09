<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SBI</title>
</head>
<body style="align-content: center;" >
	 <h1>State Bank of India </h1>
        <fieldset style="align-items: center; background-color: gray;">
        <legend> Bank Login Page</legend>
        <form action="secondJSP.jsp">
            
            <label style="color: red;"> Enter your Name</label>
            <input type="text" placeholder="Enter your name" name="a">
            <br><br>
             <label style="color: red;">Add your Photo</label>
            <input type="file" >
            <br><br>
            <label style="color: red;"> Enter your phoneNo</label>
            <input type="tel" placeholder="Enter your MobileNo">
            <br><br>
            <label style="color: red;"> Enter your AAdhar</label>
            <input type="tel" placeholder="Enter your AAdhar">
            <br><br>
            <label style="color: red;"> Enter your city</label>
            <input type="text" placeholder="Enter your city">
            <br><br>
            <label style="color: orange;"> create your Password</label>
            <input type="Password" name="b" placeholder="Enter your password">
            <br><br>
            
            <input type="submit" value="submit">
            

           
        </form>
    </fieldset>
    <h1> Login in this page!</h1>
    
    <form action="MyfirstServlet">
    	
    	<input type="text" name="a">
    	<input type="submit" value="Next">
    </form>
        
</body>
</html>