<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- Tell the JSP Page that please do not ignore Expression Language -->
<%@ page isELIgnored="false"%>
<html>
<body>
	
<form:form action="/HelloWeb/company/submitData" method="post" modelAttribute="user11">
	<form:label path="name">Name</form:label><form:input path="name"/></br></br>
	<form:label path="email">E-mail</form:label><form:input path="email"/></br></br>
	<form:label path="age">Age</form:label><form:input path="age"/></br></br>
	<input type="submit" name="SUBMIT">
</form:form>
</body>
</html>