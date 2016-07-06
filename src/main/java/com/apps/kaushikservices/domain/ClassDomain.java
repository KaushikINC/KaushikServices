/**
 * 
 */
package com.apps.kaushikservices.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * @author Babita
 *
 */
@Entity
@Table(name = "class")
public class ClassDomain {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CLASS_ID")
	private int classId;

	@Column(name = "NAME")
	private String name;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	@JoinTable(name = "subject", joinColumns = { @JoinColumn(name = "CLASS_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "SUBJECT_ID") })
	private List<SubjectDomain> subjectList;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	@JoinTable(name = "student", joinColumns = { @JoinColumn(name = "CLASS_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "STUDENT_ID") })
	private List<StudentDomain> studentList;

	/**
	 * @return the classId
	 */
	public int getClassId() {
		return classId;
	}

	/**
	 * @param classId
	 *            the classId to set
	 */
	public void setClassId(int classId) {
		this.classId = classId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the subjectList
	 */
	public List<SubjectDomain> getSubjectList() {
		return subjectList;
	}

	/**
	 * @param subjectList
	 *            the subjectList to set
	 */
	public void setSubjectList(List<SubjectDomain> subjectList) {
		this.subjectList = subjectList;
	}

	/**
	 * @return the studentList
	 */
	public List<StudentDomain> getStudentList() {
		return studentList;
	}

	/**
	 * @param studentList
	 *            the studentList to set
	 */
	public void setStudentList(List<StudentDomain> studentList) {
		this.studentList = studentList;
	}

}
