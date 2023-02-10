<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>addStudent</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
	</head>
	<body>
		<h1>학생추가</h1>
		<div>
			<input type="text" id="id">
			<button type="button" id="ckBtn">중복검사</button>
		</div>
		
		<form action="" method="post" id="addForm">
			<table border="1">
				<tr>
					<th>studentId</th>
					<td>
						<input type="text" name="studentId" id="studentId" readonly="readonly">
					</td>
				</tr>
				<tr>
					<th>studentPw</th>
					<td>
						<input type="password" name="studentPw" id="studentPw">
					</td>
				</tr>
				<tr>
					<th>studentName</th>
					<td>
						<input type="text" name="studentName" id="studentName">
					</td>
				</tr>
			</table>
			<button type="button" id="addBtn">학생추가</button>
		</form>
	</body>
	<script>
		$('#ckBtn').click(function() {
			$.ajax({
				url:'idck'
				, type : 'get'
				, data : {studentId:$('#id').val()}
				, success:function(model){ // model : 'YES' OR 'NO'
					if(model=='YES') {
						// 사용할 수 있는 아이디
						$('#studentId').val($('#id').val());
					} else {
						// 사용중인 아이디
						alert($('#id').val()+'는 사용중인 아이디입니다.');
					}
				}
			});
		});
		
		$('#addBtn').click(function() {
			// 폼 유효성 검사
			// 폼 액션전송
		});
	</script>
</html>