/**
 * 
 */
package com.apps.kaushikservices.service;

import java.util.List;

import com.apps.kaushikservices.domain.ClassDomain;
import com.apps.kaushikservices.domain.ExamDomain;
import com.apps.kaushikservices.domain.StudentDomain;
import com.apps.kaushikservices.domain.SubjectDomain;

/**
 * @author Babita
 *
 */
public interface SetUpExamService {

	public List<ClassDomain> getAllClass();

	public List<SubjectDomain> getAllSubject(ClassDomain classDomain);
	
	public List<StudentDomain> getAllStudent(ClassDomain classDomain);
	
	public int saveExamData (ExamDomain examDomain);
}
