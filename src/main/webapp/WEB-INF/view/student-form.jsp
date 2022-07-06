<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	crossorigin="anonymous">

<title>Student Form</title>
</head>
<body>
	<div class="container">
		<h3>Student Form</h3>
		<hr>


		<form action="/Christy_Xavier_Spring_MVCLabSolution/student/save"
			method="POST">
			<input type="hidden" name="studentId" value="${Student.studentId}">


			<div class="form-line">
				<input type="text" name="name" value="${Student.name}"
					class="form-control mb-4 col-4" placeholder="Name">
			</div>

			<div class="form-line">
				<input type="text" name="department" value="${Student.department}"
					class="form-control mb-4 col-4" placeholder="Department">
			</div>
			<div class="form-line">
				<input type="text" name="country" value="${Student.country}"
					class="form-control mb-4 col-4" placeholder="Country">
			</div>

			<button type="submit" class="btn btn-info col-2">Save</button>

		</form>
		<hr>
		<a href="/Christy_Xavier_Spring_MVCLabSolution/student/list">Back
			to student list</a>
	</div>
</body>
</html>