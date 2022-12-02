package com.madhavi.springboot.applicantmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madhavi.springboot.applicantmanagement.model.Applicant;

public interface ApplicantRepository extends JpaRepository<Applicant, Long>{
	List<Applicant> findByFirstName(String user);
}
