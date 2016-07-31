/**
 * 
 */
package com.apps.kaushikservices.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Babita
 *
 */
@Entity
@Table(name = "exam_question")
public class ExamQuestionDomain{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EXAM_QUESTION_ID")
	private int examQuestionId;

	@Column(name = "MARKS")
	private double marks;

	@Column(name = "NUMBER_OF_QUESTIONS")
	private int numberOfQuestions;

	@ManyToOne
	@JoinColumn(name="EXAM_ID")
	private ExamDomain examDomain;

	/**
	 * @return the examQuestionId
	 */
	public int getExamQuestionId() {
		return examQuestionId;
	}

	/**
	 * @param examQuestionId
	 *            the examQuestionId to set
	 */
	public void setExamQuestionId(int examQuestionId) {
		this.examQuestionId = examQuestionId;
	}

	/**
	 * @return the marks
	 */
	public double getMarks() {
		return marks;
	}

	/**
	 * @param marks
	 *            the marks to set
	 */
	public void setMarks(double marks) {
		this.marks = marks;
	}

	/**
	 * @return the numberOfQuestions
	 */
	public int getNumberOfQuestions() {
		return numberOfQuestions;
	}

	/**
	 * @param numberOfQuestions
	 *            the numberOfQuestions to set
	 */
	public void setNumberOfQuestions(int numberOfQuestions) {
		this.numberOfQuestions = numberOfQuestions;
	}

	/**
	 * @return the examDomain
	 */
	public ExamDomain getExamDomain() {
		return examDomain;
	}

	/**
	 * @param examDomain the examDomain to set
	 */
	public void setExamDomain(ExamDomain examDomain) {
		this.examDomain = examDomain;
	}

	/**
	 * @return the examId
	 */
	
}
