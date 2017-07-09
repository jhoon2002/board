<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!doctype html>
<html lang="ko">
<head>
<meta charset="utf-8">
<meta http-equiv="imagetoolbar" content="no">
<meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1">
<title>${title}</title>
<link rel="stylesheet" href="${contextPath}/css/admin.css">
<!--[if lte IE 8]>
<script src="http://localhost:8080/js/html5.js"></script>
<![endif]-->
<script>
// 자바스크립트에서 사용하는 전역변수 선언
var g5_url       = "http://localhost:8080";
var g5_bbs_url   = "http://localhost:8080";
var g5_is_member = "1";
var g5_is_admin  = "super";
var g5_is_mobile = "";
var g5_bo_table  = "";
var g5_sca       = "";
var g5_editor    = "";
var g5_cookie_domain = "";
var g5_admin_url = "http://localhost:8080/admin";
</script>
<script src="http://localhost:8080/js/jquery-1.8.3.min.js"></script>
<script src="http://localhost:8080/js/jquery.menu.js"></script>
<script src="http://localhost:8080/js/common.js"></script>
<script src="http://localhost:8080/js/wrest_new.js"></script>
--
</head>
<body>
