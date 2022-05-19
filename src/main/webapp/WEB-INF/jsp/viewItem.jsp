<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>

</head>
<body>
    <div id="header"></div>
        <a href="/addItem"> Add another Item </a>
        <a href="/" > Home </a></br></br>
		<form action="#" method="post">
			<h1>View Item</h1>

			Items:
                    <table>
                    <tr>
                    <th>Name</th>
                    <th>cost</th>
                    <th>Description</th>
                    <th> Locations</th>
                    <th> Operations </th>
                    </tr>
                    <c:forEach items="${items}" var="entry">
                        <tr>
                            <td>${entry.value.getName()}</td>
                            <td>${entry.value.getCost()}</td>
                            <td>${entry.value.getDescription()}</td>
                            <td>${entry.value.getLocations().toString()} </td>
                            <td>
                                <a href="/updateItem/${entry.value.getName()}">edit </a>
                                <a href= "/deleteItem/${entry.value.getName()}" >delete</a>
                                <a href="/assign/${entry.value.getName()}/"> Assign </a>
                            </td>
                        </tr>
                    </c:forEach>
                    </table>
			<div>

			</div>
		</form>

	</div>
</body>
</html>