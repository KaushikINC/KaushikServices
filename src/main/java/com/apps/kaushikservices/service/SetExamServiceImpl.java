/**
 * 
 */
package com.apps.kaushikservices.service;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.Subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.apps.kaushikservices.dao.SetUpExamDAO;
import com.apps.kaushikservices.domain.ClassDomain;
import com.apps.kaushikservices.domain.StudentDomain;
import com.apps.kaushikservices.domain.SubjectDomain;

/**
 * @author Babita
 *
 */
@Component
public class SetExamServiceImpl implements SetUpExamService {
	@Autowired
	SetUpExamDAO setUpExamDAO;

	public List<ClassDomain> getAllClass() {
		System.out.println("SetExamServiceImpl.getAllClass::Enter");
		List<ClassDomain> classList = new ArrayList();
		classList = setUpExamDAO.getAllClass();
		System.out.println("SetExamServiceImpl.getAllClass::Exit");
		return classList;
	}

	public List<SubjectDomain> getAllSubject(ClassDomain classDomain) {
		System.out.println("SetExamServiceImpl.getAllSubject::Enter");
		List<SubjectDomain> subjectList = new ArrayList();
		subjectList = setUpExamDAO.getAllSubject(classDomain);
		System.out.println("SetExamServiceImpl.getAllSubject::Exit");
		return subjectList;
	}

	

	@Override
	public List<StudentDomain> getAllStudent(ClassDomain classDomain) {
		System.out.println("SetExamServiceImpl.getAllStudent::Enter");
		List<StudentDomain> studentList = new ArrayList();
		studentList = setUpExamDAO.getAllStudent(classDomain);
		System.out.println("this is a text");
		System.out.println("SetExamServiceImpl.getAllStudent::Exit");
		return studentList;
	}
	
	
	/**
	 * @param setUpExamDAO
	 *            the setUpExamDAO to set
	 */
	public void setSetUpExamDAO(SetUpExamDAO setUpExamDAO) {
		this.setUpExamDAO = setUpExamDAO;
	}

}
