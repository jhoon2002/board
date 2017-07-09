<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="title" scope="request" value="${title}" />

<tiles:insertAttribute name="header" />
<tiles:insertAttribute name="head" />

<tiles:insertAttribute name="body" />

<tiles:insertAttribute name="tail" />
<tiles:insertAttribute name="footer" />
