<%@ include file="common/header.jspf"%>
<div class="container">
	<div>
		<a type="button" class="btn btn-primary btn-md" href="/register-applicant">Add Applicant</a>
	</div>
	<br>
	<div class="panel panel-primary">
		<div class="panel-heading">
			<h3>List of Applicant's</h3>
		</div>
		<div class="panel-body">
			<table class="table table-striped">
				<thead>
					<tr>
						<th width="10%">First Name</th>
						<th width="10%">Middle Name</th>	
						<th width="10%">Last Name</th>
						<th width="10%">Phone Number</th>	
						<th width="10%">E Mail</th>
						<th width="10%">Address</th>
						<th width="10%">Add1</th>					
						<th width="5%">City</th>
						<th width="10%">State</th>
						<th width="5%">Country</th>
						<th width="10%"></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${applicants}" var="applicant">
						<tr>
							<td>${applicant.firstName}</td>
							<td>${applicant.middleName}</td>
							<td>${applicant.lastName}</td>
							<td>${applicant.phoneNumber}</td>
							<td>${applicant.eMail}</td>
							<td>${applicant.address}</td>
							<td>${applicant.add1}</td>
							<td>${applicant.city}</td>
							<td>${applicant.state}</td>
							<td>${applicant.country}</td>
							<td><a type="button" class="btn btn-success"
								href="/update?id=${applicant.id}">Update</a>
							<a type="button" class="btn btn-warning"
								href="/delete-applicant?id=${applicant.id}">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>
<%@ include file="common/footer.jspf"%>