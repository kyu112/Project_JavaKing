<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="device-width, initial-scale=1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<style type="text/css">

	body{
		vertical-align : middle;
	}
	table{
		text-align: middle; 
	}

	h2{
		color: #083b90;
		margin-left: 90px;
	}
	
	#form-control { 
		height: 20px; 
		width: 120px;
		line-height: normal;
	}
	div{
		padding:10px;	
	}
	label{
		padding-top : 5px;
	}
	.tab_menu_container{
		margin-left: 70px;
		margin-right: 80px;
		width : 700px;
		display:flex;
		padding-top : 0;
		padding-bottom: 0;
	}

	.tab_menu_btn {
	  width:80px;
	  height:40px;
	  background-color : #f1f4f8;
	  transition:0.3s all;
	  border : 1px solid gray;
	}
	.tab_menu_btn.on {
	  border-top:2px solid #083b90;
	  border-left : 1px solid gray;
	  font-weight:700;
	  color:#083b90;
	  background-color: #ffffff;
	}
	.tab_menu_btn:hover {
	  color:#f1f4f8;
	}
	.table2{
		margin-left: 80px;
		margin-right: 80px;
		background-color: #f1f4f8;
		width : 800px;
	}
	th {
        text-align: center;
    }
    td {
        text-align: center;
    }

	.container1{
		display: table-cell;
		padding-bottom:20px;
	}
	.container2{
		display: table-cell;
	}
	.container3{
		display: table-cell;
	}
	.container4{
		display: table-cell;
	}
	#submit{
		padding-top: 10px;
		margin-left: 80px;
		border : 1px solid black;
		background-color: #083b90;
		color:#f1f4f8;
	}
</style>
</head>
<body>
	<h2>학사정보</h2>

	<form action="adminStudentInfo">
	<div class="info">
		<div id="tabs" class="tab_menu_container">
			<button class="tab_menu_btn" type="button" onclick="location='studentInfo.do'">기본정보</button>
	    	<button class="tab_menu_btn" type="button" onclick="location='startEndDate.do'">입학/졸업</button>
	  		<button class="tab_menu_btn on" type="button" onclick="location='change.do'">학적변동</button>
	  		<button class="tab_menu_btn" type="button" onclick="location='listGrade.do'">성적</button>
	  		<button class="tab_menu_btn" type="button" onclick="location='detailClass.jsp'">수강</button>
	  		<button class="tab_menu_btn" type="button" onclick="location='listReg.do'">등록</button>
	  	</div>
			<table border="1" class="table2">
				<tr >
					<th>년도</th>
					<th>학기</th>
					<th width="200px">변동구분</th>
					<th>변동학년</th>
					<th width="200px">변동일자</th>
				</tr>
		
				<tr>
					<td><input type="text" id="div년도" class="form-control" name="change_year" value="${change.change_year }"></td>
					<td><input type="text" id="div학기" class="form-control" name="change_semester" value="${change.change_semester }"></td>
					<td><input type="text" id="div변동구분" class="form-control" name="change_sub" value="${change.change_sub }"></td>
					<td><input type="text" id="div변동학년" class="form-control" name="change_level" value="${change.change_level }"></td>
					<td><input type="text" id="div변동일" class="form-control" name="change_date" value="${change.change_date }"></td>
				</tr>
		</table>
		</div>
	</form>
</body>
</html>