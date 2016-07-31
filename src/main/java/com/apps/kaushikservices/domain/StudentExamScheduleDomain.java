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
@Table(name = "student_exam_schedule")
public class StudentExamScheduleDomain {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "STUDENT_EXAM_SCHEDULE_ID")
	private int studentExamScheduleId;
	@Column(name = "STUDENT_ID")
	private int studentId;
	@Column(name = "EXAM_ID")
	private int examId;

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
