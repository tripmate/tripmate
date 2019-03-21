<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>동행 찾기 목록</title>
</head>
<body>

	<h5>동행 리스트?</h5>
	
	<table class="table table-bordered">
		<tr>
			<th>동행 번호</th>
			<th>작성자</th>
			<th>제목</th>
			<th>등록일</th>
			<th>조회</th>
		</tr>
		
		<c:forEach items="${list}" var="mateVO">
			<tr>
				<td>${mateVO.mate_no}</td>
				<td>${mateVO.writer}</td>
				<td><a href="/mate/mateForm?mate_no=${mateVO.mate_no}">${mateVO.title}</a></td>
				<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${mateVO.regdate}"/></td>
				<td><span class="badge bd-red">0</span></td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>