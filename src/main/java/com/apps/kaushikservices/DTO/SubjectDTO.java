/**
 * 
 */
package com.apps.kaushikservices.DTO;

/**
 * @author Babita
 *
 */
public class SubjectDTO {
	private int subjectId;
	private String name;
	private int noOfChapter;
	private int classId;

	/**
	 * @return the subjectId
	 */
	public int getSubjectId() {
		return subjectId;
	}

	/**
	 * @param subjectId
	 *            the subjectId to set
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
	 * @param name
	 *            the name to set
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
	 * @param noOfChapter
	 *            the noOfChapter to set
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
	 * @param classId
	 *            the classId to set
	 */
	public void setClassId(int classId) {
		this.classId = classId;
	}
}
