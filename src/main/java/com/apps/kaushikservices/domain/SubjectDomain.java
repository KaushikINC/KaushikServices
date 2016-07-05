/**
 * 
 */
package com.apps.kaushikservices.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Babita
 *
 */
@Entity
@Table(name = "subject")
public class SubjectDomain {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SUBJECT_ID")
	private int subjectId;
	
	@Column(name = "NAME", nullable = false)
	private String name;
	
	@Column(name = "NO_OF_CHAPTER", nullable = false)
	private int noOfChapter;
	
	@Column(name = "CLASS_ID", nullable = false)
	private int classId;

	/**
	 * @return the subjectId
	 */
	public int getSubjectId() {
		return subjectId;
	}

	/**
	 * @param subjectId the subjectId to set
	 */
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the noOfChapter
	 */
	public int getNoOfChapter() {
		return noOfChapter;
	}

	/**
	 * @param noOfChapter the noOfChapter to set
	 */
	public void setNoOfChapter(int noOfChapter) {
		this.noOfChapter = noOfChapter;
	}

	/**
	 * @return the classId
	 */
	public int getClassId() {
		return classId;
	}

	/**
	 * @param classId the classId to set
	 */
	public void setClassId(int classId) {
		this.classId = classId;
	}

}
