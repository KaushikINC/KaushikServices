/**
 * 
 */
package com.apps.kaushikservices.DTO;

/**
 * @author Babita
 *
 */
public class StudentExamScheduleDTO {
	private int studentExamScheduleId;
	private int studentId;
	private int examId;

	public StudentExamScheduleDTO(){}
	/**
	 * @return the studentExamScheduleId
	 */
	public int getStudentExamScheduleId() {
		return studentExamScheduleId;
	}

	/**
	 * @param studentExamScheduleId
	 *            the studentExamScheduleId to set
	 */
	public void setStudentExamScheduleId(int studentExamScheduleId) {
		this.studentExamScheduleId = studentExamScheduleId;
	}

	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}

	/**
	 * @param studentId
	 *            the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	/**
	 * @return the examId
	 */
	public int getExamId() {
		return examId;
	}

	/**
	 * @param examId
	 *            the examId to set
	 */
	public void setExamId(int examId) {
		this.examId = examId;
	}
}
