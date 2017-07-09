<%@ tag body-content="scriptless" pageEncoding="utf-8" description="최신글 출력 태그" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ attribute name="skin" required="true" type="java.lang.String" %>
<%@ attribute name="pageList" required="true" type="java.util.List" %>

<%
request.setAttribute("pageList", pageList);
%>

<c:set var="skinUri" value="/WEB-INF/view/skin/pageNavi/${skin}/pageNavi.jsp" />

<jsp:include page="${skinUri}" flush="false" />
