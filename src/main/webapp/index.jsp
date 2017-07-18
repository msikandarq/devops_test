<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="data.html">
Item Name = <select name="item">
				<option value="">-select-</option>
				<option >milk</option>
				<option >bread</option>
				<option >food</option>
				</select><br>
Quantity = <select name="quantity">
				<option value="">-select-</option>
				<option >1</option>
				<option >2</option>
				<option >3</option>
				</select><br>	

<button type="submit" value="calculate price">calculate price</button>
</form>
    </body>
</html>
