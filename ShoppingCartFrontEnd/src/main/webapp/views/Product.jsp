 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<link rel="stylesheet"href="<c:url value="/resources/admin.css"/>">
<html>
<head>
<title>Product Page</title>
</head>
<body>
${msg}
<h1>Add product</h1>
<c:url var="addAction" value="product/add"></c:url>
<form:form action="${addAction}" commandName="product">
<table>
	<tr>
			<td><form:label path="prot_id"> <spring:message text="ID"/></form:label></td>
					<c:choose>
							<c:when test="${!empty product.prot_id}">
							<td><form:input path="prot_id" readonly="true"/> </td>
							</c:when>
									
							 <c:otherwise>
							 <td><form:input path="prot_id" pattern="{5,10}" required="true" title="id should be between 5 to 10 characters"/> </td>
							 </c:otherwise>
					</c:choose>
			</tr>
		<tr>
			<td><form:label path="prot_name"> <spring:message text="NAME"/></form:label></td>
			<td><form:input path="prot_name" required="true"/> </td>
		</tr>
		
		<tr>
			<td><form:label path="prot_description"> <spring:message text="DESCRIPTION"/></form:label></td>
			<td><form:input path="prot_description" required="true"/> </td>
		</tr>
		
		<tr>
			<td><form:label path="prot_price"> <spring:message text="PRICE"/></form:label></td>
			<td><form:input path="prot_price" required="true"/> </td>
		</tr>
							
	       <tr>
	  <td><form:label path="supplier"><spring:message text="Supplier"/></form:label></td>
	  
	  <td><form:select path="supplier_id">
	           <c:forEach items="${supplierList}" var="supplier">
								<form:option class="input1" value="${supplier.supr_id}">${supplier.supr_name}</form:option>
							</c:forEach>
							</form:select>
							</td>
	           </tr>
	           
	       <tr>
	  <td><form:label path="category"><spring:message text="Category"/></form:label></td>
	  <td><form:select path="category_id"  >
	           <c:forEach items="${categoryList}" var="category">
								<form:option class="input1" value="${category.ctg_id}">${category.ctg_name}</form:option>
							</c:forEach>
							</form:select>
							</td>
	           +</tr> 
		<tr>
			<td colspan="2">
			<c:if test="${!empty product.prot_name}">
			<input type="submit" value="<spring:message text="Edit product"/> "> 
			</c:if>
			<c:if test="${empty product.prot_name}">
			<input type="submit" value="<spring:message text="Add product"/> "> 
			</c:if>
			</td>

		</tr>
</table>
</form:form>
<br>

	              
	             
	            <h3>Product List</h3>
<c:if test="${!empty productList}">
	<table class="tg">
	<tr>
		<th > Product Id</th>
		<th >Product Name</th>
		<th >Product Description</th>
				<th>Product Description</th>
					<th>Category</th>
						<th>Supplier</th>
		<th>Edit</th>
		<th>Delete</th>
	</tr>
	<c:forEach items="${productList}" var="product">
		<tr>
			<td>${product.prot_id}</td>
			<td>${product.prot_name}</td>
			<td>${product.prot_description}</td>
			<td>${product.prot_price}</td>
			<td>${product.category_id}<td>
			<td>${product.supplier_id} </td>
			<td><a href="<c:url value="product/edit/${product.prot_id}"/>" >Edit</a></td>
			<td><a href="<c:url value="product/remove/${product.prot_id}"/>" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html> 