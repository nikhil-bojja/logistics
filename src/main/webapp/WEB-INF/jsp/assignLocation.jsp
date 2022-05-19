<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>

    </head>
    <body>
        <div id="header"></div>
        <h1>Location Home Page</h1>
        <a href="/addLocation" > Add Location </a>
        <a href="/" > Home </a></br></br>
        Locations:

          <c:forEach items="${locations}" var="entry">
            <a href="/assign/${itemLocation}/${entry.value.getName()}">${entry.value.getName()}</p>
          </c:forEach>

    </body>
</html>