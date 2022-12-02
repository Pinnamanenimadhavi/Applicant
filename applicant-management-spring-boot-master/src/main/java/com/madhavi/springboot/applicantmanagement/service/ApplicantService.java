package com.madhavi.springboot.applicantmanagement.service;

import java.util.List;
import java.util.Optional;

import com.madhavi.springboot.applicantmanagement.model.Applicant;

public interface ApplicantService {

	List<Applicant> getApplicantsByUser(String user);
	List<Applicant> allApplicants();
	Optional<Applicant> getApplicantById(long id);

	void updateApplicant(Applicant applicant);

	void deleteApplicant(long id);
	
	void saveApplicant(Applicant applicant);

}