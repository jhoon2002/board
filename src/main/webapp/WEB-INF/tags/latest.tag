<%@ tag body-content="scriptless" pageEncoding="utf-8" description="최신글 출력 태그" %>
<%@ tag import="org.springframework.web.context.WebApplicationContext,
                org.springframework.web.servlet.support.RequestContextUtils,
                com.jhoon.springboard.service.BoardService,
                com.jhoon.springboard.entity.Post,
                java.util.ArrayList" %>

<%@ attribute name="skin" required="true" type="java.lang.String" %>
<%@ attribute name="rows" required="true" type="java.lang.String" %>
<%@ attribute name="limit" required="true" type="java.lang.String" %>
<%
System.out.println(this);

//business
WebApplicationContext ctx = RequestContextUtils.getWebApplicationContext(request);
BoardService boardService = (BoardService) ctx.getBean("boardService");
ArrayList<Post> posts = boardService.readList();

System.out.println("business return: listSize: " + posts.size());

request.setAttribute("posts", posts);
request.setAttribute("skin", skin);
request.setAttribute("rows", rows);
request.setAttribute("limit", limit);

String skinUri = "/WEB-INF/view/skin/latest/" + skin + "/latest.jsp";
%>
<jsp:include page="<%=skinUri%>" flush="false" />
