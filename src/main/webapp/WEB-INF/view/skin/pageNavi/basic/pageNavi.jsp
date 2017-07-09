<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="encode" uri="urlEncoding" %>

<div style="padding:3px;">

<c:forEach items="${pageList}" var="page" varStatus="status">
    
    <c:choose>
        <c:when test="${page.begin and page.prev}">
            <c:choose>
                <c:when test="${param.word == '' or param.word == null}">
                    <a href="${contextPath}/read?boid=${param.boid}&page=${page.number - 1}" class="page">&lt;</a>
                </c:when>
                <c:otherwise>
                    <a href="${contextPath}/read?boid=${param.boid}&page=${page.number - 1}&word=${encode:urlEncode(param.word)}&field=${param.field}" class="page">&lt;</a>
                </c:otherwise>
            </c:choose>
        </c:when>
    </c:choose>
    
    <c:choose>
        <c:when test="${page.now}">
            <c:set var="className" value="nowPage" />
        </c:when>
        <c:otherwise>
            <c:set var="className" value="page" />
        </c:otherwise>
    </c:choose>
    
    <c:choose>
        <c:when test="${param.word == '' or param.word == null}">
            <a href="${contextPath}/read?boid=${param.boid}&page=${page.number}" class="${className}">${page.number}</a>
        </c:when>
        <c:otherwise>
            <a href="${contextPath}/read?boid=${param.boid}&page=${page.number}&word=${encode:urlEncode(param.word)}&field=${param.field}" class="${className}">${page.number}</a>
        </c:otherwise>
    </c:choose>
    
    <c:choose>
        <c:when test="${page.end and page.next}">
            <c:choose>
                <c:when test="${param.word == '' or param.word == null}">
                    <a href="${contextPath}/read?boid=${param.boid}&page=${page.number + 1}" class="page">&gt;</a>
                </c:when>
                <c:otherwise>
                    <a href="${contextPath}/read?boid=${param.boid}&page=${page.number + 1}&word=${encode:urlEncode(param.word)}&field=${param.field}" class="page">&gt;</a>
                </c:otherwise>
            </c:choose>
        </c:when>
    </c:choose>
    
</c:forEach>

</div>