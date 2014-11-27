<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- Tell the JSP Page that please do not ignore Expression Language -->
<%@ page isELIgnored="false"%>
<html>
<body>
	
<form:form action="/springweb/company/" method="post" modelAttribute="user11" >
	<form:label path="name">Name : </form:label>${user11.name}</br>
	<form:label path="email">E-mail :</form:label>${user11.email}</br>
	<form:label path="age">Age : </form:label>${user11.age}</br>
	<input type="submit" title="Return To Input Form"  name="Return To Input Form">
</form:form>
</body>
</html>