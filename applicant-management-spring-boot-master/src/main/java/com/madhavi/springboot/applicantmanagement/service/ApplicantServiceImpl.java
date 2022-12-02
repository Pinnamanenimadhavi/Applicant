package com.madhavi.springboot.applicantmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madhavi.springboot.applicantmanagement.model.Applicant;
import com.madhavi.springboot.applicantmanagement.repository.ApplicantRepository;

@Service
public class ApplicantServiceImpl implements ApplicantService {

	@Autowired
	private ApplicantRepository applicantRepository;

	@Override
	public List<Applicant> getApplicantsByUser(String user) {
		return applicantRepository.findByFirstName(user);
	}

	@Override
	public Optional<Applicant> getApplicantById(long id) {
		return applicantRepository.findById(id);
	}

	@Override
	public void updateApplicant(Applicant applicant) {
		applicantRepository.save(applicant);
	}
	
	@Override
	public void deleteApplicant(long id) {
		Optional<Applicant> applicant = applicantRepository.findById(id);
		if (applicant.isPresent()) {
			applicantRepository.delete(applicant.get());
		}
	}

	@Override
	public void saveApplicant(Applicant applicant) {
		applicantRepository.save(applicant);
	}

	@Override
	public List<Applicant> allApplicants() {
		return applicantRepository.findAll();
	}
}