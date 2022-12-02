<%@ include file="common/header.jspf"%>
<div class="container">
<h1>Applicant Register Form</h1>
<form action="add-applicant" method="post" modelAttribute="applicant">
			<table style="with: 50%">
				<tr>
					<td>Applicant ID</td>
					<td><input type="text" name="id" value="${applicant.id}"/></td>
				</tr>
				<tr>
					<td>First Name</td>
					<td><input type="text" name="firstName" value="${applicant.firstName}"/></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lastName" /></td>
				</tr>
					<tr>
					<td>MiddleName</td>
					<td><input type="text" name="middleName" /></td>
				</tr>
				<tr>
					<td>PhoneNumber</td>
					<td><input type="text" name="phoneNumber" /></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="eMail" /></td>
				</tr>
					<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address" /></td>
				</tr>
				<tr>
					<td>Add1</td>
					<td><input type="text" name="add1" /></td>
				</tr>
				<tr>
					<td>City</td>
					<td><input type="text" name="city" value="${applicant.city}"/></td>
				</tr>
				<tr>
					<td>State</td>
					<td><input type="text" name="state" /></td>
				</tr>
				<tr>
					<td>Country</td>
					<td><input type="text" name="country" /></td>
				</tr>
</table>
			<input type="submit" value="Submit" /></form>
</div>
<%@ include file="common/footer.jspf"%>