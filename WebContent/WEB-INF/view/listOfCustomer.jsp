<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>

<head>
<title>List of Customers</title>
</head>

<body>

	<h1>JayPrints - Fashion World..!!</h1>

	<div id="content">
		<table>
			<th>SrNo</th>
			<th>Customer Name</th>
			<th>Dress Type</th>

			<c:forEach var="customers" items="${customers} }">
				<tr>
					<td>${customers.srNo}</td>
					<td>${customers.custName}</td>
					<td>${customers.dressType}</td>
				</tr>

			</c:forEach>
		</table>
	</div>
</body>

</html>