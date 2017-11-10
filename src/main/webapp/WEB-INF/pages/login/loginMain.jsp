<c:url value="/login" var="xxx"/>
<form action="${xxx}" method="post">
    <input type="text" name="username">
    <input type="password" name="password">
    <input type="submit" value="login">
    <input type="hidden"
    name="${_csrf.parameterName}"
    value="${_csrf.token}">
</form>