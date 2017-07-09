<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="pageNavi" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="encode" uri="urlEncoding" %>

<table class="board_table" style="padding:2px; width:100%; margin-bottom:10px;">
<tr>
    <td style="width: 50px;background:#3E6AB5; height:2px"></td>
    <td style="width:     ;background:#3E6AB5;"></td>
    <td style="width:100px;background:#3E6AB5;"></td>
    <td style="width:140px;background:#3E6AB5;"></td>
    <td style="width: 50px;background:#3E6AB5;"></td>
</tr>
<tr>
    <td class="write_title">번호</td>
    <td class="write_title">제목</td>
    <td class="write_title">작성자</td>
    <td class="write_title">날짜</td>
    <td class="write_title">조회</td>
</tr>
<c:forEach var="write" items="${writes}">
<tr>
    <td class="write_td">${write.id}</td>
    <td class="write_td" style="text-align: left;">
    <c:forEach begin="1" end="${fn:length(write.wrReply)}">
        &nbsp;
    </c:forEach>
    <c:choose>
        <c:when test="${fn:length(write.wrReply) > 0}">
            <img src="${contextPath}/img/icon_reply.gif" border="0" />
        </c:when>
    </c:choose>
    <c:choose>
        <c:when test="${param.word == '' or param.word == null}">
            <a href="${contextPath}/read?boid=${listParam.boid}&page=${listParam.page}&wrid=${write.id}">
                <c:choose>
                    <c:when test="${fn:length(write.wrSubject) > 35}">
                        <c:out value="${fn:substring(write.wrSubject, 0, 35)}" />...
                    </c:when>
                    <c:otherwise>
                        <c:out value="${write.wrSubject}" />
                    </c:otherwise>
                </c:choose>
            </a>
        </c:when>
        <c:otherwise>
            <a href="${contextPath}/read?boid=${listParam.boid}&page=${listParam.page}&wrid=${write.id}&word=${encode:urlEncode(param.word)}&field=${param.field}">
                <c:choose>
                    <c:when test="${fn:length(write.wrSubject) > 35}">
                        <c:out value="${fn:substring(write.wrSubject, 0, 35)}" />...
                    </c:when>
                    <c:otherwise>
                        <c:out value="${write.wrSubject}" />
                    </c:otherwise>
                </c:choose>
            </a>
        </c:otherwise>
    </c:choose>

    </td>
    <td class="write_td">
        ${write.wrName}
    </td>
    <td class="write_td">
        <fmt:formatDate value="${write.wrDatetime}" pattern="yyyy-MM-dd" />
    </td>
    <td class="write_td">
        ${write.wrHit}
    </td>
</tr>
</c:forEach>
</table>

<c:if test="${param.wrid == '' or param.wrid == null}">
    <div style="text-align:center; margin:0px 0px 0px 0px;">
    <form:form commandName="listParam" method="GET">
        <form:hidden path="boid"/>
        <form:select path="field" multiple="false">
            <form:option value="wrSubject">제목</form:option>
            <form:option value="wrContent">내용</form:option>
            <form:option value="wrName">글쓴이</form:option>
            <form:option value="member">아이디</form:option>
        </form:select>
        <form:input cssStyle="padding:2px; width:100px;" path="word"  />
        <input type="submit" value="OK" style="height:20px; width:30px;" />
    </form:form>
    </div>
</c:if>

<div style="text-align:left; margin:0px 0px 0px 0px;">
    <a href="${contextPath}/post?boid=${param.boid}"><button class="sp_btn" type="button">글쓰기</button></a>
</div>

<div style="text-align: center; margin: 10px 0px 40px 0px">
    <pageNavi:pageNavi skin="basic" pageList="${pageList}" />
</div>
