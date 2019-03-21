<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form id="mateForm" name="mateForm" method="post">
		<div class="box-body">
			<div class="form-group">
				<label for="mate_no">게시글 번호</label>
				<input type="text" id="mate_no" name="mate_no" class="form-control" value="${mateVO.mate_no}" readonly="readonly" />
				<label for="writer">작성자</label>
				<input type="text" id="writer" name="writer" class="form-control" value="${mateVO.writer}" readonly="readonly" />
				<label for="title">제목</label>
				<input type="text" id="title" name="title" class="form-control" value="${mateVO.title}" readonly="readonly" />
				<label for="content">내용</label>
				<textarea id="content" name="content" class="form-control" rows="3" readonly>${mateVO.content}</textarea>
				<label for="regdate">등록일</label>
				<input type="text" id="regdate" name="regdate" class="form-control" value="${mateVO.regdate}" readonly="readonly" />
				<label for="updatedate">수정일</label>
				<input type="text" id="updatedate" name="updatedate" class="form-control" value="${mateVO.updatedate}" readonly="readonly" />
			</div>
		</div>
		<!-- //end box-body -->
		
		<div class="box-footer">
			<button type="button" type="submit" id="btnSave" name="btnSave" class="btn btn-primary">저장</button>
			<button type="button" type="submit" id="btnCancel" name="btnCancel" class="btn btn-warning">취소</button>
		</div>
	</form>
	
	<script>
		$(document).ready(function() {
			
			$('#btnCancel').on('click', function() {
				self.location = '/mate/mateList';
			});
			
			$('#btnSave').on('click', function() {
				$('#mateForm').submit();
			});
			
		});
	</script>
</body>
</html>