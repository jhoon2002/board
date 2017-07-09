<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
//String skin = (String)request.getAttribute("skin");
//String rows = (String)request.getAttribute("rows");
//String limit = (String)request.getAttribute("limit");
//out.println("latest.jsp: " + this);
%>
<!-- 
<div style="padding:3px;">
    <div>ㅇ skin: ${skin}</div>
    <div>ㅇ rows: ${rows}</div>
    <div>ㅇ limit: ${limit}</div>
</div>
-->
<div style="padding:3px; background:#cccccc; width:200px;">자유게시판</div>

<div style="padding:3px;">
<c:forEach var="post" items="${posts}">
<div style="padding:3px;">

    <c:if test="${fn:length(post.subject) > 25}">
        <c:out value="${fn:substring(post.subject, 0, 25)}" />...
    </c:if>
    <c:if test="${fn:length(post.subject) <= 25}">
        <c:out value="${post.subject}" />
    </c:if>
    (<spring:eval expression="post.writeDate" />)

</div>
</c:forEach>
</div>