/**
 * 
 */
package com.apps.kaushikservices.dao;

import java.util.List;

import javax.security.auth.Subject;

import com.apps.kaushikservices.domain.ClassDomain;
import com.apps.kaushikservices.domain.StudentDomain;
import com.apps.kaushikservices.domain.SubjectDomain;

/**
 * @author Babita
 *
 */
public interface SetUpExamDAO {
	public List<ClassDomain> getAllClass();

	public List<SubjectDomain> getAllSubject(ClassDomain classDomain);
	
	public List<StudentDomain> getAllStudent(ClassDomain classDomain);
}
