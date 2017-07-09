<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
//String skin = (String)request.getAttribute("skin");
//String rows = (String)request.getAttribute("rows");
//String limit = (String)request.getAttribute("limit");

out.println("latest.jsp: " + this);
%>
<div>
ㅇ skin: ${skin}<br/>
ㅇ rows: ${rows}<br/>
ㅇ limit: ${limit}<br/>
</div>


<div style="font-weight:bold; margin:20px 0px 10px 0px;">최신글 목록</div>

<table style="width:400px; margin-bottom:30px;">
<col width="280" />
<col width="120" />
<c:forEach var="post" items="${posts}">
<tr>
    <td>
        <c:if test="${fn:length(post.subject) > 20}">
            <c:out value="${fn:substring(post.subject, 0, 20)}" />...
        </c:if>
        <c:if test="${fn:length(post.subject) <= 20}">
            <c:out value="${post.subject}" />
        </c:if>
    </td>
    <td>
        <spring:eval expression="post.writeDate" />
    </td>
</tr>
</c:forEach>
</table>