<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="encode" uri="urlEncoding" %>
<% pageContext.setAttribute("LF", "\r\n"); %>
<% pageContext.setAttribute("BR", "<br/>"); %>

<form:form commandName="write" method="POST">
<form:hidden path="board" id="boid" />
<form:hidden path="id" />
<input id="page" name="page" type="hidden" value="${page}" />
<table class="board_table" style="padding:2px; width:100%;">
<tr>
    <td style="width:80px;background:#3E6AB5; height:2px; font-weight:bold; text-align:center;"></td>
    <td style="width:    ;background:#3E6AB5;"></td>
</tr>
<tr>
    <td class="form_td" style="font-weight:bold; text-align:center;">제목</td>
    <td class="form_td"><form:input cssStyle="padding:2px; width:95%;" path="wrSubject" /></td>
</tr>
<tr>
    <td class="form_td" style="font-weight:bold; text-align:center;">작성자</td>
    <td class="form_td"><form:input cssStyle="padding:2px; width:100px;" path="wrName" /></td>
</tr>
<tr>
    <td class="form_td" style="font-weight:bold; text-align:center;">아이디</td>
    <td class="form_td"><form:input cssStyle="padding:2px; width:100px;" path="member" /></td>
</tr>
<tr>
    <td class="form_td" style="font-weight:bold; text-align:center; vertical-align:top; ">글내용</td>
    <td class="form_td">
        <form:textarea cssStyle="padding:10px; width:95%; height:400px;" path="wrContent"/>
    </td>
</tr>
</table>
<div style="text-align:center; margin:0px 0px 0px 0px;">
    <input type="submit" value="확인" class="sp_btn" />
</div>

</form:form>