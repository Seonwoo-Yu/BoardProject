<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="kr.ac.kopo.kopo27.domain.*" %>
<%@ page import="kr.ac.kopo.kopo27.service.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	BoardService boardService = new BoardServiceImpl();
	Board board = boardService.selectOne(1);
%>
Hello world!
board title: <%= board.getTitle() %>
</body>
</html>