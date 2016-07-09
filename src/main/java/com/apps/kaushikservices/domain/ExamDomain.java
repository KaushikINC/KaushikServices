/**
 * 
 */
package com.apps.kaushikservices.domain;

import java.sql.Date;

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
@Table(name = "exam")
public class ExamDomain {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EXAM_ID")
	private int examId;

	@Column(name = "NAME")
	private String name;

	@Column(name = "TYPE")
	private String type;

	@Column(name = "FORMAT")
	private String format;

	@Column(name = "CLASS_NAME")
	private String className;

	@Column(name = "SUBJECT")
	private String subject;

	@Column(name = "CHAPTER_RANGE")
	private String chapterRange;

	@Column(name = "MAXMIMUM_MARKS")
	private int maximumMarks;

	@Column(name = "START_TIME")
	private Date startTime;

	@Column(name = "EXPIRY_TIME")
	private Date expiryTime;

	@Column(name = "DURATION")
	private double duration;

	@Column(name = "SEND_EMAIL")
	private boolean sendEmail;

	@Column(name = "SHOW_RESULT_AFTER_EXAM")
	private boolean showResultAfterExam;

	@Column(name = "SHOW_QUESTION_SCORE")
	private boolean showQuestionScore;

	@Column(name = "TEACHER_CRADENTIAL_REQUIRE")
	private boolean teacherCradentialRequire;

	@Column(name = "EMAIL_ON_START")
	private boolean emailOnStart;

	@Column(name = "EMAIL_ON_COMPLETE")
	private boolean emailOnComplete;

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
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the format
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * @param format
	 *            the format to set
	 */
	public void setFormat(String format) {
		this.format = format;
	}

	/**
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * @param className
	 *            the className to set
	 */
	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject
	 *            the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * @return the chapterRange
	 */
	public String getChapterRange() {
		return chapterRange;
	}

	/**
	 * @param chapterRange
	 *            the chapterRange to set
	 */
	public void setChapterRange(String chapterRange) {
		this.chapterRange = chapterRange;
	}

	/**
	 * @return the maximumMarks
	 */
	public int getMaximumMarks() {
		return maximumMarks;
	}

	/**
	 * @param maximumMarks
	 *            the maximumMarks to set
	 */
	public void setMaximumMarks(int maximumMarks) {
		this.maximumMarks = maximumMarks;
	}

	/**
	 * @return the startTime
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime
	 *            the startTime to set
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the expiryTime
	 */
	public Date getExpiryTime() {
		return expiryTime;
	}

	/**
	 * @param expiryTime
	 *            the expiryTime to set
	 */
	public void setExpiryTime(Date expiryTime) {
		this.expiryTime = expiryTime;
	}

	/**
	 * @return the duration
	 */
	public double getDuration() {
		return duration;
	}

	/**
	 * @param duration
	 *            the duration to set
	 */
	public void setDuration(double duration) {
		this.duration = duration;
	}

	/**
	 * @return the sendEmail
	 */
	public boolean isSendEmail() {
		return sendEmail;
	}

	/**
	 * @param sendEmail
	 *            the sendEmail to set
	 */
	public void setSendEmail(boolean sendEmail) {
		this.sendEmail = sendEmail;
	}

	/**
	 * @return the showResultAfterExam
	 */
	public boolean isShowResultAfterExam() {
		return showResultAfterExam;
	}

	/**
	 * @param showResultAfterExam
	 *            the showResultAfterExam to set
	 */
	public void setShowResultAfterExam(boolean showResultAfterExam) {
		this.showResultAfterExam = showResultAfterExam;
	}

	/**
	 * @return the showQuestionScore
	 */
	public boolean isShowQuestionScore() {
		return showQuestionScore;
	}

	/**
	 * @param showQuestionScore
	 *            the showQuestionScore to set
	 */
	public void setShowQuestionScore(boolean showQuestionScore) {
		this.showQuestionScore = showQuestionScore;
	}

	/**
	 * @return the teacherCradentialRequire
	 */
	public boolean isTeacherCradentialRequire() {
		return teacherCradentialRequire;
	}

	/**
	 * @param teacherCradentialRequire
	 *            the teacherCradentialRequire to set
	 */
	public void setTeacherCradentialRequire(boolean teacherCradentialRequire) {
		this.teacherCradentialRequire = teacherCradentialRequire;
	}

	/**
	 * @return the emailOnStart
	 */
	public boolean isEmailOnStart() {
		return emailOnStart;
	}

	/**
	 * @param emailOnStart
	 *            the emailOnStart to set
	 */
	public void setEmailOnStart(boolean emailOnStart) {
		this.emailOnStart = emailOnStart;
	}

	/**
	 * @return the emailOnComplete
	 */
	public boolean isEmailOnComplete() {
		return emailOnComplete;
	}

	/**
	 * @param emailOnComplete
	 *            the emailOnComplete to set
	 */
	public void setEmailOnComplete(boolean emailOnComplete) {
		this.emailOnComplete = emailOnComplete;
	}
}
