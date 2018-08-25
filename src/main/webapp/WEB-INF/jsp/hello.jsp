<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
 <head>
  <title>Tourists</title>
 </head> 
 <body>
  <h1>TestMessage : ${userName1}</h1>	
  <div>
      <table border="1">
        <c:forEach  items="${tours}" var ="tour">
        <tr>         
	  <td>${tour.tourId}</td>
          <td>${tour.name}</td>
	  <td>${tour.description}</td>
          <td>${tour.location}</td>
        </tr>
        </c:forEach>
      </table>
  </div>
 </body>
</html>