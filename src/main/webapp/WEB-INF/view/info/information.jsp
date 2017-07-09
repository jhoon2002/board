<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="util" tagdir="/WEB-INF/tags/latest" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="title" scope="request" value="회사 소개" />

<tiles:insertAttribute name="header" />
<tiles:insertAttribute name="head" />

회사소개 시작
<br/>
<br/>

<util:text skin="white" limit="5" rows="50" />
<util:text skin="notice" limit="302" rows="24" />


<br/>
<br/>
회사소개 끝

<tiles:insertAttribute name="tail" />
<tiles:insertAttribute name="footer" />