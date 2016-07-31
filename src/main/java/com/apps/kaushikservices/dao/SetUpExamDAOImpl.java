/**
 * 
 */
package com.apps.kaushikservices.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.apps.kaushikservices.domain.ClassDomain;
import com.apps.kaushikservices.domain.ExamDomain;
import com.apps.kaushikservices.domain.ExamQuestionDomain;
import com.apps.kaushikservices.domain.StudentDomain;
import com.apps.kaushikservices.domain.StudentExamScheduleDomain;
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
		List<ExamQuestionDomain> questionList = examDomain.getQuestions();
		Integer examId = (Integer) getSession().save(examDomain);
		for (ExamQuestionDomain obj : questionList) {
			obj.setExamDomain(examDomain);
			getSession().save(obj);
		}

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

	@Override
	public boolean updateTargetInformation(ExamDomain examDomain) {
		System.out.println("SetUpExamDAOImpl.updateTargetInformation::Enter");
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Criteria criteria =  session.createCriteria(ExamDomain.class)
				.add(Restrictions.eq("examId", examDomain.getExamId()));
		Object object =  criteria.uniqueResult();
		ExamDomain examObject = (ExamDomain) object;
	
		System.out.println(examObject.getMaximumMarks());
		System.out.println(examObject.getExpiryTime());
		examObject.setDuration(examDomain.getDuration());
		examObject.setEmailOnComplete(examDomain.isEmailOnComplete());
		examObject.setEmailOnStart(examDomain.isEmailOnStart());
		examObject.setExpiryTime(examDomain.getExpiryTime());
		examObject.setSendEmail(examDomain.isSendEmail());
		examObject.setShowQuestionScore(examDomain.isShowQuestionScore());
		examObject.setShowResultAfterExam(examDomain.isShowResultAfterExam());
		examObject.setStartTime(examDomain.getStartTime());
		examObject.setTeacherCradentialRequire(examDomain.isTeacherCradentialRequire());
		System.out.println(examObject.getMaximumMarks());
		System.out.println(examObject.getExpiryTime());
		try {
			session.update(examObject);
			System.out.println("SetUpExamDAOImpl.updateTargetInformation::Exit");
			tx.commit();
			return false;
		} catch (Exception e) {
			throw e;
			
			
		}
	}

	@Override
	public boolean saveStudentExamSchedule(List<StudentExamScheduleDomain> studentExamScheduleDomainList) {
		System.out.println("SetUpExamDAOImpl.saveStudentExamSchedule::Enter");
		try {
			for (StudentExamScheduleDomain studentExamScheduleDomain : studentExamScheduleDomainList) {
				getSession().save(studentExamScheduleDomain);
			}
			System.out.println("SetUpExamDAOImpl.saveStudentExamSchedule::Exit");
			return true;
		} catch (Exception e) {

			System.out.println("SetUpExamDAOImpl.saveStudentExamSchedule::Exit");
			return false;
		}
	}

}
