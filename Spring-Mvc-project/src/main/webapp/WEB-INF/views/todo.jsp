<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Add Todo</title>

</head>
<body>

	<div class="container">
		<form:form method="post" commandName="todo">
			<fieldset class="form-group">
				<form:label path="desc">Description</form:label>
				<form:input path="desc" type="text" class="form-control"
					required="required"/>
				<form:errors path="desc"  />

			</fieldset>
			<button type="submit" >Add</button>
		</form:form>
	</div>

	

</body>
</html>