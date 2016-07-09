/**
 * 
 */
package com.apps.kaushikservices.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.apps.kaushikservices.domain.ClassDomain;
import com.apps.kaushikservices.domain.ExamDomain;
import com.apps.kaushikservices.domain.StudentDomain;
import com.apps.kaushikservices.domain.SubjectDomain;

/**
 * @author Babita
 *
 */
@Component
public class SetUpExamDAOImpl implements SetUpExamDAO {
	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.openSession();
	}

	public List<ClassDomain> getAllClass() {
		System.out.println("SetUpExamDAOImpl.getAllClass::Enter");
		List classList = new ArrayList();
		classList = getSession().createCriteria(ClassDomain.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
				.list();
		System.out.println(classList.size());
		System.out.println("SetUpExamDAOImpl.getAllClass::Exit");
		return classList;
	}

	public List<SubjectDomain> getAllSubject(ClassDomain classDomain) {
		System.out.println("SetUpExamDAOImpl.getAllSubject::Enter");
		List<SubjectDomain> subjectList = new ArrayList();
		subjectList = getSession().createCriteria(SubjectDomain.class)
				.add(Restrictions.eq("classId", classDomain.getClassId())).list();
		System.out.println(subjectList.size());
		System.out.println("SetUpExamDAOImpl.getAllSubject::Exit");
		return subjectList;
	}

	@Override
	public List<StudentDomain> getAllStudent(ClassDomain classDomain) {
		System.out.println("SetUpExamDAOImpl.getAllStudent::Enter");
		List<StudentDomain> studentList = new ArrayList();
		studentList = getSession().createCriteria(StudentDomain.class)
				.add(Restrictions.eq("classId", classDomain.getClassId())).list();
		System.out.println(studentList.size());
		System.out.println("SetUpExamDAOImpl.getAllStudent::Exit");
		return studentList;
	}

	@Override
	public int saveExamData(ExamDomain examDomain) {
		System.out.println("SetUpExamDAOImpl.saveExamData::Enter");

		int examId = (Integer) getSession().save(examDomain);

		System.out.println("SetUpExamDAOImpl.saveExamData::Exit");
		return examId;
	}

	/**
	 * @param sessionFactory
	 *            the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
