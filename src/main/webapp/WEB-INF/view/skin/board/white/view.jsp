<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="page" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="encode" uri="urlEncoding" %>
<% pageContext.setAttribute("LF", "\r\n"); %>
<% pageContext.setAttribute("BR", "<br/>"); %>

<table class="board_table" style="padding:2px; width:100%;">
<tr>
    <td style="width:50px;background:#3E6AB5; height:2px"></td>
    <td style="width:    ;background:#3E6AB5;"></td>
    <td style="width:50px;background:#3E6AB5;"></td>
    <td style="width:150px;background:#3E6AB5;"></td>
    <td style="width:30px;background:#3E6AB5;"></td>
    <td style="width:30px;background:#3E6AB5;"></td>
    <td style="width:30px;background:#3E6AB5;"></td>
    <td style="width:30px;background:#3E6AB5;"></td>
</tr>
<tr>
    <td class="view_title">제목</td>
    <td class="view_title" colspan="7">${write.wrSubject}</td>
</tr>
<tr>
    <td class="view_title">작성자</td>
    <td class="view_title">${write.wrName}</td>
    <td class="view_title">작성일</td>
    <td class="view_title" style="font-weight:normal;"><fmt:formatDate value="${write.wrDatetime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
    <td class="view_title">조회</td>
    <td class="view_title" style="font-weight:normal;">${write.wrHit}</td>
    <td class="view_title">추천</td>
    <td class="view_title" style="font-weight:normal;">${write.wrGood}</td>
</tr>
<tr>
    <td colspan="8" style="padding:20px; line-height:20px; height:100px; vertical-align:top;">
        <c:out value="${fn:replace(write.wrContent, LF, BR)}" escapeXml="false"/>
    </td>
</tr>
</table>

<div style="text-align:left; margin:0px 0px 40px 0px;">
    <c:choose>
        <c:when test="${param.word == '' or param.word == null}">
            <a href="${contextPath}/read?boid=${listParam.boid}&page=${listParam.page}">
            <button class="sp_btn" type="button">목록</button></a>
        </c:when>
        <c:otherwise>
            <a href="${contextPath}/read?boid=${listParam.boid}&page=1">
                <button class="sp_btn" type="button">목록</button></a>
            <a href="${contextPath}/read?boid=${listParam.boid}&page=${listParam.page}&word=${encode:urlEncode(param.word)}&field=${param.field}">
                <button class="sp_btn" type="button">검색목록</button></a>
        </c:otherwise>
    </c:choose>
    <a href="${contextPath}/edit?boid=${listParam.boid}&wrid=${listParam.wrid}&page=${listParam.page}">
    <button class="sp_btn" type="button">수정</button></a>
    <a href="${contextPath}/reply?boid=${listParam.boid}&wrid=${listParam.wrid}&page=${listParam.page}">
    <button class="sp_btn" type="button">답글</button></a>
</div>

<jsp:include page="${skinUrl}/list.jsp" flush="false" />
