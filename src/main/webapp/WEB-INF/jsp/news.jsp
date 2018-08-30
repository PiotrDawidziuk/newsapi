<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
</head>
<body>
<h1>News</h1>

<table class="list">
    <tr>
        <th>Your passwords:</th>

    </tr>
    <c:forEach items="${articles}" var="article">
        <tr>
            <td>${password.title}</td>
        </tr>
    </c:forEach>
</table>

<%--<p>--%>

<%--<table class="list">--%>
    <%--<tr>--%>
        <%--<th>Your passwords:</th>--%>

    <%--</tr>--%>
    <%--<c:forEach items="${article}" var="article">--%>
        <%--<tr>--%>
            <%--<td>${article.author}</td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td>${article.title}</td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td>${article.description}</td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td>${article.url}</td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td>${article.urlToImage}</td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td>${article.publishedAt}</td>--%>
        <%--</tr>--%>
    <%--</c:forEach>--%>
<%--</table>--%>
<%--</p>--%>

</body>
</html>