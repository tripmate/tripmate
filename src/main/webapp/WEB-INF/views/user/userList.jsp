<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h5>유저 목록</h5>
	
	<table id="userTable" class="display">
	    <thead>
	        <tr>
	            <th>id</th>
	            <th>name</th>
	            <th>age</th>
	        </tr>
	    </thead>
	   <!--  <tbody>
	        <tr>
	            <td>Row 1 Data 1</td>
	            <td>Row 1 Data 2</td>
	        </tr>
	        <tr>
	            <td>Row 2 Data 1</td>
	            <td>Row 2 Data 2</td>
	        </tr>
	    </tbody> -->
	</table>
	
	<script>
		$(document).ready(function () {
			$('#userTable').DataTable( {
			    ajax: '/user/selectUserList',
			    columns: [
			        { data: 'id' },
			        { data: 'name' },
			        { data: 'age' }
			    ]
			} );
		});
	</script>

</body>
</html>